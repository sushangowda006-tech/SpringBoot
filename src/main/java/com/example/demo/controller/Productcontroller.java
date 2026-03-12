package com.example.demo.controller;


import com.example.demo.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.response.ProductResponse;

@RestController
@RequestMapping("/product")
public class Productcontroller {

    @Autowired
    private ProductServices productService;

    @PostMapping("/adds")
    public ProductResponse Calculate(@RequestBody ProductRequest req) {
        return productService.Calculatebill(req);
    }
}