package com.example.game;

import java.util.Random;

public class Cleric {

    String name;

    static final int MAX_HP = 50;
    static final int MAX_MP = 10;
    int hp = MAX_HP;
    int mp = MAX_MP;

    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    Cleric(String name, int hp) {
        this(name, hp, MAX_MP);
    }

    Cleric(String name) {
        this(name, MAX_HP, MAX_MP);
    }
    
    // 기본생성자
    Cleric() {
        
    }
   



    Random random = new Random();

    void SelfAid() {
        this.mp -= 5;
        this.hp = MAX_HP;
    }


    int pray(int sec) {
        int rand = random.nextInt(3);
        int heal = sec + rand;

        if (this.mp + heal < MAX_MP) {
            this.mp += heal;
        } else {
            this.mp = MAX_MP;
            heal = 0;
        }
        return heal;
    }

}
