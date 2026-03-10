package com.example.demo.dto.response;

public class ApiResponse {
    private String name;
    private ProductResponse data;

    public ApiResponse(String name, ProductResponse data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductResponse getData() {
        return data;
    }

    public void setData(ProductResponse data) {
        this.data = data;
    }
}