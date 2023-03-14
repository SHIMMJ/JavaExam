package com.simminjeong.praticeex.exam10;

public class Wand {

    private String name;
    private double power;

    public String getName() {
        return name;
    }

    // 마법사나 지팡이의 이름은 null 일 수 없고, 반드시 3문자 이상이어야 한다
    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("이름이 너무 짧음. 3문자 이상이어야함");
        }

        this.name = name;
    }

    public double getPower() {
        return power;
    }

    // 지팡이의 마력은 0.5 이상 100.0 이하여야 한다.
    public void setPower(double power) {
        if (!(0.5 <= power && power <= 100)) {
            throw new IllegalArgumentException("지팡이의 마력은 0.5 이상 100.0 이하여야 한다.");
        }
        this.power = power;
    }

}
