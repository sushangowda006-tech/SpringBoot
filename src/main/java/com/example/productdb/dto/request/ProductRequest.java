package com.example.productdb.dto.request;

import java.util.List;

public class ProductRequest {
    private String customer;
    private List<Integer> product;
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customername) {
        this.customer = customername;
    }
    public List<Integer> getProduct() {
        return product;
    }
    public void setProduct(List<Integer> product) {
        this.product = product;
    }
}
