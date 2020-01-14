package com.qinglan.controller;

import com.qinglan.domain.Product;
import com.qinglan.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView=new ModelAndView();
        List<Product> productList = iProductService.findAll();
        modelAndView.setViewName("product-list");
        modelAndView.addObject("productList", productList);
        return modelAndView;
    }
}
