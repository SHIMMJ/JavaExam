package com.simminjeong.praticeex.exam11;

public class PoisonKinoko extends Kinoko {

    private int remainCount;

    public PoisonKinoko(char suffix) {
        super(suffix);
        remainCount = 5;
    }

    @Override //annotation하는 이유 : 눈에 잘 보이게
    public void attack(Hero hero) {
        super.attack(hero);
        double damage = 0.2 * hero.getHp();

        if (remainCount > 0) {
            System.out.println("추가로, 독 포자를 살포했다!");
            hero.setHp(hero.getHp() - damage);
            System.out.println(damage + "포인트의 데미지");

        }
    }

}