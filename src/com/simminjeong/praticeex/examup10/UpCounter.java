package com.simminjeong.praticeex.examup10;

public class UpCounter implements Counter {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int count() {
        return count++;
    }

}
