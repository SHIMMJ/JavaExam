package com.simminjeong.praticeex.exam10;

public class Main {
    
    public void something(int... nums) {}
    
    public static void main(String[] args) {

        Wizard wizard = new Wizard();
        Wand wand = new Wand();
        
        wizard.setWand(null);
        // Exception in thread "main" java.lang.IllegalArgumentException: 마법사의 지팡이는 null 일 수 없다.
        wizard.setMp(-10);
        // Exception in thread "main" java.lang.IllegalArgumentException: 마법사의 MP는 0 이상이어야 한다.
        wizard.setName(null);
        // Exception in thread "main" java.lang.IllegalArgumentException: 이름은 null이 아니어야 함
        wizard.setName("지팡");
        // Exception in thread "main" java.lang.IllegalArgumentException: 이름이 너무 짧음. 3문자 이상이어야함
        wand.setPower(200);
        // 지팡이의 마력은 0.5 이상 100.0 이하여야 한다.
        wizard.setHp(-10);
        // hp 음수


    }



}
