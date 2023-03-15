package com.simminjeong.praticeex.exam10;

public class Wizard {

    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름이 너무 짧음");
        }

        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    // HP가 음수가 되는 상황에서는 대신 0을 설정 되도록 한다. (에러 아님)
    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
            System.out.println("hp 음수");
        }

        this.hp = hp;
    }

    public double getMp() {
        return mp;
    }

    // 마법사의 MP는 0 이상이어야 한다.
    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0 이상이어야 한다.");
        }
        this.mp = mp;
    }

    public Wand getWand() {
        return wand;
    }

    // 마법사의 지팡이는 null 일 수 없다.
    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null 일 수 없다.");
        }
    }

    public void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
    }

}
