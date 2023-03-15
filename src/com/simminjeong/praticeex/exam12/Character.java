package com.simminjeong.praticeex.exam12;

//추상메서드가 하나라도 있으면 추상 클래스
public abstract class Character {
    private String name;
    private int hp;

    // 생성자
    public Character(String name) {
        this.name=name;
        this.hp=100;
        
    }
    //추상메서드
    public abstract void attack(Kinoko kinoko);


    
    // getter setter
    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public int getHp() {
        return hp;
    }



    public void setHp(int hp) {
        this.hp = hp;
    }



    public void run() {
        System.out.println("도망쳤다.");
    }

}
