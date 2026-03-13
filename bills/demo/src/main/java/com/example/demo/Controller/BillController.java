package com.example.demo.Controller;

import com.example.demo.entity.BillEntity;
import com.example.demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bills")
public class BillController {

    @Autowired
    private BillService billService;

    @PostMapping
    public BillEntity createBill(@RequestBody BillEntity bill){
        return billService.createBill(bill);
    }

}