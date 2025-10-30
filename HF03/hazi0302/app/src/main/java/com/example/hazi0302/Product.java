package com.example.hazi0302;

public class Product {
    private String name;
    private String code;
    private float price;


    public Product(float price, String code, String name) {
        this.price = price;
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


}


