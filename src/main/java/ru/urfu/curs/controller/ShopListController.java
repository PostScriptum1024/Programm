package ru.urfu.curs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.urfu.curs.dto.*;
import ru.urfu.curs.entity.ShopList;
import ru.urfu.curs.repository.ProductInShopRepository;
import ru.urfu.curs.repository.ProductRepository;
import ru.urfu.curs.repository.ShopListRepository;
import ru.urfu.curs.repository.ShopRepository;
import ru.urfu.curs.service.UserService;
import ru.urfu.curs.utility.RoleEnum;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Controller
public class ShopListController {
    @Autowired
    private ShopListRepository shopListRepository;
    @Autowired
    private ProductInShopRepository productInShopRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ShopRepository shopRepository;
    @Autowired
    private UserService userService;

    @GetMapping("/list/all")
    public ModelAndView lists() {
        var mav = new ModelAndView("lists");

        List<ShopList> lists;
        if (userService.checkRole(RoleEnum.ADMIN)) {
            lists = shopListRepository.findAll();
        } else if (userService.checkRole(RoleEnum.USER)) {
            lists = shopListRepository.findByUserId(userService.getUserId());
        } else  {
            lists = shopListRepository.findAll();
        }

        mav.addObject("table", ShopListTable.builder()
                .isReadOnly(!userService.checkRole(RoleEnum.ADMIN) && userService.checkRole(RoleEnum.READ_ONLY))
                .lists(lists.stream().map(l -> (ShopListItemDto)ShopListItemDto.builder()
                    .id(l.getId())
                    .date(l.getCreated())
                    .email(l.getUser().getEmail())
                    .build()).toList())
                .build());
        return mav;
    }
    @GetMapping("/list/{id}")
    public ModelAndView list(@PathVariable Long id) {
        var mav = new ModelAndView("shoplist");
        var list = shopListRepository.findById(id).get();

        mav.addObject("list", ShopListDto.builder()
                .id(list.getId())
                .email(list.getUser().getEmail())
                .date(list.getCreated())
                .isReadOnly(!userService.checkRole(RoleEnum.ADMIN) && userService.checkRole(RoleEnum.READ_ONLY))
                .products(list.getProductInShops().stream().map(
                        pis -> (ProductInListDto)(ProductInListDto.builder()
                                .id(pis.getId())
                                .cost(pis.getCost())
                                .shop(pis.getShop().getName())
                                .productId(pis.getProduct().getId())
                                .name(pis.getProduct().getName())
                                .build())
                ).toList())
                .build());
        mav.addObject("shopProducts", productInShopRepository.findAll().stream().map(pis -> ProductAddListDto.builder()
                .id(pis.getId())
                .productName(pis.getProduct().getName())
                .cost(pis.getCost())
                .shopName(pis.getShop().getName())
                .build()
        ));
        return mav;
    }
    @GetMapping("/list/add")
    public String add(@RequestParam Long listId, @RequestParam Long itemId) {
        shopListRepository.findById(listId).ifPresent(list -> {
            productInShopRepository.findById(itemId).ifPresent(pis -> {
                list.getProductInShops().add(pis);
                shopListRepository.save(list);
            });
        });
        return "redirect:/list/" + listId;
    }
    @GetMapping("/list/delete")
    public String del(@RequestParam Long listId, @RequestParam Long itemId) {
        var list = shopListRepository.findById(listId).get();
        list.getProductInShops().stream().filter(pis -> Objects.equals(pis.getId(), itemId)).findFirst().ifPresent(pis -> list.getProductInShops().remove(pis));
        shopListRepository.save(list);
        return "redirect:/list/" + listId + "?deleted";
    }
    @GetMapping("/list/create")
    public String create() {
        var list = shopListRepository.save(ShopList.builder().user(userService.getUser()).created(new Date()).build());
        return "redirect:/list/" + list.getId();
    }
}
