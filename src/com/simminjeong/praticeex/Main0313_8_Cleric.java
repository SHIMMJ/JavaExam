package com.simminjeong.praticeex;

import java.util.Random;

public class Main0313_8_Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10; // int mp = MAX_MP;
    final int MAX_MP = 10;

    void SelfAid() {
        this.mp -= 5;
        this.hp = this.MAX_HP;
        System.out.println("SelfAid");
        System.out.println("MP : " + this.mp + " HP : " + this.hp);
    }

    // Math.min()하면 좋음
    int pray(int sec) {
        int rand = new Random().nextInt(3); // new 같은 경우는 그냥 필드(메소드 밖에서) 선언하자
        int heal = sec + rand;

        if (mp + heal < MAX_MP) { // this.mp this.MAX_MP
            mp += heal;
        } else {
            mp = MAX_MP;
            heal = 0;
        }

        return heal;
    }

}
