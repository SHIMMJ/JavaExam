package com.simminjeong.praticeex.exam12;

//abstract 붙이면 attack을 꼭 구현 안해도됨(의무는 없다.)
//일반클래스는 꼭 구현해야함
//Character와 Human은 관계 없음
public class Dancer extends Character implements Human {

    public Dancer(String name) {
        super(name);
    }

    @Override //상속받아서 강제로 구현해야함
    public void attack(Kinoko kinoko) {
        
    }

    @Override
    public void talk() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void watch() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void hear() {
        // TODO Auto-generated method stub
        
    }
    

}
