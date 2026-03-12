package com.example.demo.dto.response;

<<<<<<< HEAD
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
=======
public class ApiResponse<T> {
    private String status;
    private T data;

    public ApiResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
>>>>>>> 3e67eac394e99441a8fe3e3b4445c95a183ce637
