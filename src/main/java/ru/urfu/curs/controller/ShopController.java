package ru.urfu.curs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.urfu.curs.dto.ProductDto;
import ru.urfu.curs.dto.ShopItemDto;
import ru.urfu.curs.dto.ShopTableDto;
import ru.urfu.curs.entity.Shop;
import ru.urfu.curs.utility.RoleEnum;
import ru.urfu.curs.repository.ShopRepository;
import ru.urfu.curs.service.UserService;

@Controller
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private UserService userService;
    @Autowired
    private ShopRepository shopRepository;

    @GetMapping("/all")
    public ModelAndView all() {
        var mav = new ModelAndView("shops");
        mav.addObject("table", ShopTableDto.builder()
                .isReadOnly(!userService.checkRole(RoleEnum.ADMIN))
                .shops(shopRepository.findAll().stream().map(s -> ShopItemDto.builder().id(s.getId()).name(s.getName()).build()).toList())
                .build());
        return mav;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        return getEditView(null);
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable Long id) {
        var shop = shopRepository.findById(id).get();
        return getEditView(ShopItemDto.builder().id(id).name(shop.getName()).build());
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        shopRepository.deleteById(id);
        return "redirect:/shop/all";
    }

    private ModelAndView getEditView(ShopItemDto dto) {
        var mav = new ModelAndView("shop-form");
        dto = dto == null ? new ShopItemDto() : dto;
        mav.addObject("shop", dto);
        return mav;
    }

    @PostMapping("/save")
    public String save(@ModelAttribute ProductDto dto) {
        shopRepository.save(Shop.builder().id(dto.getProductId()).name(dto.getName()).build());
        return "redirect:/shop/all";
    }
}
