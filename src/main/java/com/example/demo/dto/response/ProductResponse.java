package com.example.demo.dto.response;

public class ProductResponse {
    private double total;
    private double net_total;
    private double tax;

    public ProductResponse(double total, double net_total, double tax) {
        this.total = total;
        this.net_total = net_total;
        this.tax = tax;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getNet_total() {
        return net_total;
    }

    public void setNet_total(double net_total) {
        this.net_total = net_total;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}