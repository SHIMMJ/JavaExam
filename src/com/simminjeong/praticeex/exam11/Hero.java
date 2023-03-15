package com.simminjeong.praticeex.exam11;

public class Hero {
    private String name = "김영웅";
    private double hp = 100;

    public Hero() {

    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    // 싸우기
    public void attack(Kinoko eneny) {
        System.out.println(this.name + "의 공격!");
        this.hp -= 5;
        System.out.println("5포인트의 데미지를 주었다!");
    }


    // 도망
    public void run() {
        System.out.println(this.name + "는 도망쳤다!");
    }

}
