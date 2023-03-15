package com.simminjeong.praticeex.exam12pratice;

public abstract class Asset {
    // asset은 추상적인 개념으로 인스턴스 안만들려고

    private String name;
    private int price;
    private String color;

    Asset(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    };

    public int getPrice() {
        return price;
    };

    public String getColor() {
        return color;

    }
}
