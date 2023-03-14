package com.example.game2;

public class Main {

    public static void main(String[] args) {


        System.out.println(Hero.money);

        Hero superman = new Hero("슈퍼맨", 100);
        Hero batman = new Hero("배트맨", 100);

        Hero.money = 100;
        Hero.money = 50;

        System.out.println(Hero.money);
        System.out.println(Hero.money);
    }

}
