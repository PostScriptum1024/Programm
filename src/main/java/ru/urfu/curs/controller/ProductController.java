package ru.urfu.curs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.urfu.curs.dto.ProductDto;
import ru.urfu.curs.dto.ProductInShopDto;
import ru.urfu.curs.dto.ProductItemDto;
import ru.urfu.curs.dto.ProductTableDto;
import ru.urfu.curs.entity.Product;
import ru.urfu.curs.entity.ProductInShop;
import ru.urfu.curs.utility.RoleEnum;
import ru.urfu.curs.repository.ProductInShopRepository;
import ru.urfu.curs.repository.ProductRepository;
import ru.urfu.curs.repository.ShopRepository;
import ru.urfu.curs.service.UserService;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private UserService userService;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ShopRepository shopRepository;
    @Autowired
    private ProductInShopRepository productInShopRepository;

    @GetMapping("/all")
    public ModelAndView all() {
        var mav = new ModelAndView("products");
        mav.addObject("table", ProductTableDto.builder()
                .isReadOnly(!userService.checkRole(RoleEnum.ADMIN))
                .products(productRepository.findAll().stream().map(p -> {
                    var productInShops = productInShopRepository.findByProductId(p.getId());
                    var res = ProductItemDto.builder()
                            .productId(p.getId())
                            .name(p.getName())
                            .productInShops(productInShops.stream().map(pis -> ProductInShopDto.builder()
                                    .id(pis.getId())
                                    .productId(pis.getProduct().getId())
                                    .shopId(pis.getShop().getId())
                                    .productName(pis.getProduct().getName())
                                    .shopName(pis.getShop().getName())
                                    .cost(pis.getCost())
                                    .build()
                            ).toList())
                            .minCost(productInShops.stream().mapToDouble(ProductInShop::getCost).min().orElse(0.0))
                            .maxCost(productInShops.stream().mapToDouble(ProductInShop::getCost).max().orElse(0.0))
                            .build();
                    return res;
                }).toList()).build());
        return mav;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        return getEditView(null);
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable Long id) {
        var product = productRepository.findById(id).get();
        return getEditView(ProductDto.builder().productId(id).name(product.getName()).build());
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        productRepository.deleteById(id);
        return "redirect:/product/all";
    }

    private ModelAndView getEditView(ProductDto dto) {
        var mav = new ModelAndView("product-form");
        dto = dto == null ? new ProductDto() : dto;
        mav.addObject("product", dto);
        return mav;
    }

    @PostMapping("/save")
    public String save(@ModelAttribute ProductDto dto) {
        productRepository.save(Product.builder().id(dto.getProductId()).name(dto.getName()).build());
        return "redirect:/product/all";
    }


    @GetMapping("/shop/create/{id}")
    public ModelAndView createInShop(@PathVariable Long id) {
        var mav = new ModelAndView("product-shop-form");
        var product = productRepository.findById(id).get();
        var dto = ProductInShopDto.builder().productId(id).productName(product.getName()).build();
        mav.addObject("productShop", dto);
        mav.addObject("shops", shopRepository.findAll());
        return mav;
    }

    @GetMapping("/shop/edit/{id}")
    public ModelAndView editInShop(@PathVariable Long id) {
        var mav = new ModelAndView("product-shop-form");
        var productInShop = productInShopRepository.findById(id).get();
        mav.addObject("productShop", ProductInShopDto.builder()
                .id(productInShop.getId())
                .productId(productInShop.getProduct().getId())
                .productName(productInShop.getProduct().getName())
                .shopName(productInShop.getShop().getName())
                .cost(productInShop.getCost())
                .shopId(productInShop.getShop().getId())
                .build()
        );
        mav.addObject("shops", shopRepository.findAll());
        return mav;
    }

    @RequestMapping(value = "/shop/save", method = RequestMethod.POST, params = "action=save")
    public String saveInShop(@ModelAttribute ProductInShopDto dto) {
        productInShopRepository.save(ProductInShop.builder()
                .id(dto.getId())
                .cost(dto.getCost())
                .product(productRepository.findById(dto.getProductId()).get())
                .shop(shopRepository.findById(dto.getShopId()).get())
                .build());
        if (dto.getProductId() != null) {
            return "redirect:/product/edit/" + dto.getProductId();
        } else if (dto.getShopId() != null) {
            return "redirect:/shop/edit/" + dto.getShopId();
        } else {
            return "redirect:/product/all";
        }
    }

    @RequestMapping(value = "/shop/save", method = RequestMethod.POST, params = "action=delete")
    public String deleteInShop(@ModelAttribute ProductInShopDto dto) {
        productInShopRepository.deleteById(dto.getId());
        if (dto.getProductId() != null) {
            return "redirect:/product/edit/" + dto.getProductId();
        } else if (dto.getShopId() != null) {
            return "redirect:/shop/edit/" + dto.getShopId();
        } else {
            return "redirect:/product/all";
        }
    }
}