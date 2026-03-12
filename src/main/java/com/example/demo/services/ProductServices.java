package com.example.demo.services;


import org.springframework.stereotype.Service;

import com.example.demo.dto.request.ProductRequest;
import com.example.demo.dto.response.ProductResponse;

@Service
public class ProductServices
{
    public ProductResponse Calculatebill(ProductRequest req)
    {
        double total=0;

        total=req.getP1()+req.getP2()+req.getP3()+req.getP4()+req.getP5()+req.getP6()+req.getP7()+req.getP8()+req.getP9()+req.getP10();

        double tax=total*0.18;
        double net_total=tax+total;

        return new ProductResponse(total,net_total,tax);
    }

}