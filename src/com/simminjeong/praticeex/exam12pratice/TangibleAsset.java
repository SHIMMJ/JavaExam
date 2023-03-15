package com.simminjeong.praticeex.exam12pratice;

public abstract class TangibleAsset extends Asset implements Thing {

    private double weight;

    TangibleAsset(String name, int price, String color, double weight) {
        super(name, price, color);
        this.weight = weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {

        return weight;
    }

}
