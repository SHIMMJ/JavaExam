package com.simminjeong.praticeex.exam12pratice;

public class Computer extends TangibleAsset {

    private String makerName;

    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }



    public String getMakerName() {
        return makerName;
    }



    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        return 0;
    }



    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return null;
    }

}
