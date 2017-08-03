package com.productspring.demo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @GetMapping("/product")
    public String addProducts( Model model){

        model.addAttribute("product","new Product()");
        return "addProduct";

    }

    @PostMapping("/product")
    public String showProd(@ModelAttribute Product product){
        return "showProduct";
    }

}
