package com.example.demo.service;

import com.example.demo.entity.BillEntity;
import com.example.demo.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public BillEntity createBill(BillEntity bill){
        return billRepository.save(bill);
    }

}