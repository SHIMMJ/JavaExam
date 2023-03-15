package com.simminjeong.praticeex.exam11;

public class Kinoko {
    int hp;
    private char suffix;

    public Kinoko(char suffix) {
        this.suffix=suffix;
    }

    public void attack(Hero hero) {
        System.out.println("키노코 "+this.suffix+" 의 공격");
        System.out.println("10의 데미지");
        hero.setHp(hero.getHp()-10);
    }
    
    void run() {
        System.out.println("괴물 버섯" + suffix + "는 도망쳤다.");
    }

}
