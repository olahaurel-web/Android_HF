package com.example.hazi06.models;

public class CurrencyItem {
    private int flagResID;
    private String code;
    private String name;
    private String buyPrice;
    private String sellPrice;

    public CurrencyItem(int flagResID, String code, String name, String buyPrice, String sellPrice) {
        this.flagResID = flagResID;
        this.code = code;
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public int getFlagResID() {
        return flagResID;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getBuyPrice() {
        return buyPrice;
    }

    public String getSellPrice() {
        return sellPrice;
    }
}
