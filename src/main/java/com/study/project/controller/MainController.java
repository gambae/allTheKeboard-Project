package com.study.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.study.project.dto.ItemSearchDto;
import com.study.project.dto.MainItemDto;
import com.study.project.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.ui.Model;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final ItemService itemService;

    // 메인페이지 이동
    @GetMapping(value = "/")
    public String item(ItemSearchDto itemSearchDto, Optional<Integer> page, Model model){

        Pageable pageable = PageRequest.of(page.isPresent() ? page.get() : 0, 8);
        Page<MainItemDto> items = itemService.getMainItemPage(itemSearchDto, pageable);

        model.addAttribute("items", items);
        model.addAttribute("itemSearchDto", itemSearchDto);
        model.addAttribute("maxPage", 5);

        System.out.println(items.getContent().toArray().length);

        return "index";
    }

    @GetMapping(value = "/blogPage")
    public String bolgdetail() {
        return "blog-detail";
    }

    @GetMapping(value = "/home-02Page")
    public String home02() { return "home-02";}

    @GetMapping(value = "/home-03Page")
    public String home03() {
        return "home-03";
    }

    @GetMapping(value = "/product-detailPage")
    public String productdetail() {
        return "product-detail";
    }

    @GetMapping(value = "/shoping-cartPage")
    public String shopingcart() {
        return "shoping-cart";
    }

    @GetMapping(value = "/ex")
    public String ex() {
        return "ex";
    }

}
