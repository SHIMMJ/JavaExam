package com.example.game;

public class Main {

    public static void main(String[] args) {

        // // 용사 생성
        // Hero hero = new Hero();
        // // 속성 지정
        // // 레퍼런스 타입은 null 값으로 초기화
        // // System.out.println(hero.name + ":" + hero.hp); //null:0
        // hero.name = "슈퍼맨";
        // hero.hp = 100;
        // System.out.println("이름은 "+hero.name + " 체력은 " + hero.hp +"인 캐릭터를 생성했습니다!");
        //
        // Kinoko kinoko1 = new Kinoko();
        // kinoko1.hp = 50;
        // kinoko1.suffix = 'A';
        //
        // Kinoko kinoko2 = new Kinoko();
        // kinoko2.hp = 48;
        // kinoko2.suffix = 'B';
        //
        // hero.slip();
        // kinoko1.run();
        // kinoko2.run();
        // hero.run();
        //
        //// hero.sit(5);
        //// hero.slip();
        //// hero.sit(25);
        //// hero.run();

        Cleric cleric = new Cleric();
        Cleric cleric1 = new Cleric("아서스",40,5);
        Cleric cleric2 = new Cleric("아서스",35);
        Cleric cleric3 = new Cleric("아서스");
        System.out.println("MP : " + cleric1.mp + " HP : " + cleric.hp + "인 캐릭터를 생성했습니다!");
        cleric.SelfAid();
        int heal = cleric1.pray(3);
        System.out.println("heal : " + heal + " 만큼되어 MP : " + cleric.mp + " HP : " + cleric.hp);

    }
}
