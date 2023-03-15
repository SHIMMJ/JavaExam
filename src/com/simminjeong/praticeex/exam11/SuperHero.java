package com.simminjeong.praticeex.exam11;

public class SuperHero extends Hero {
    
    private boolean flying;
    
    public SuperHero() {
        System.out.println("superhero 생성자");
    }
    
    public void fly() {
        flying=true;
        System.out.println("날았다.");
    }
    
    public void land() {
        flying=false;
        System.out.println("착지했다.");
        
    }
    
    @Override
    public void attack(Kinoko eneny) {
        
        System.out.println("준비운동");
        
        super.attack(eneny);// Hero 클래스의 attack을 살린다.
        
        if (flying) {
            System.out.println("추가공격");
        }
    }
    
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("퇴각했다");
    }


}
