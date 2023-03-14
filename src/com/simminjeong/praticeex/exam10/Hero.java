package com.simminjeong.praticeex.exam10;

public class Hero {

    private String name;
    private int hp;


    Hero(String name, int hp) {
        this.name = name;
        this.hp = 100;
    }


    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


}
