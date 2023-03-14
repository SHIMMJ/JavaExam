package com.example.game2;

public class Hero {

    String name;

    int hp;
    Sword sword;

    // static 공유자원
    // 정적 항상 그대로 인것
    static int money;



    // 기본 생성자 primary constuctor
    // 생성자 오버로드
    // 생성자 호출

    Hero(String name, int hp) {
        this.name = name;
        this.hp = 100;
    }

    Hero(String name) {
        this(name, 100);
    }

    Hero(int hp) {
        this("noname", 100);
    }

    Hero() {
        this("noname", 100);
    }


    void attack() {}

    void run() {
        System.out.println(this.name + "은 도망쳤다!");
        System.out.println("GAME OVER");
        System.out.println("최종 HP는 " + this.hp + " 입니다.");
    };

    void sit(int sec) {
        this.hp += sec;
        System.out.println(this.name + "은" + sec + "초 앉았다.");
        System.out.println("HP가 " + sec + "포인트 회복되었다.");
    };

    void slip() {
        this.hp -= 5;
        System.out.println(this.name + "은 넘어졌다.");
        System.out.println("5의 데미지!");
    };

    void sleep() {
        this.hp = 100; // hp=100
        System.out.println(this.name + "은 잠을 자고 회복했다!");
    };

    static void setRandomMoney() {
//        this.hp //불가
        Hero.money = (int) (Math.random() * 1000);
    }
}
