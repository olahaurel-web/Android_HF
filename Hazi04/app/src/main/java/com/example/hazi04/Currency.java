package com.example.hazi04;

public class Currency {
    private String code;
    private String name;
    private double buyRate;
    private double sellRate;
    private int flagResId;

    public Currency(String code, String name, double buyRate, double sellRate, int flagResId) {
        this.code = code;
        this.name = name;
        this.buyRate = buyRate;
        this.sellRate = sellRate;
        this.flagResId = flagResId;
    }

    public int getFlagResId() {
        return flagResId;
    }

    public void setFlagResId(int flagResId) {
        this.flagResId = flagResId;
    }

    public double getSellRate() {
        return sellRate;
    }

    public void setSellRate(double sellRate) {
        this.sellRate = sellRate;
    }

    public double getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(double buyRate) {
        this.buyRate = buyRate;
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
}
