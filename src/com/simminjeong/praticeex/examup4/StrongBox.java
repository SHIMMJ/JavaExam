package com.simminjeong.praticeex.examup4;

enum KeyType {
    PADLOCK, BUTTON, DIAL, FINGER;
}

public class StrongBox<T> {

    private T data;
    private int count; // 기준횟수

    public StrongBox(KeyType keytype) {// 열쇠의 종류를 받는 생성자
        if (keytype == KeyType.PADLOCK) {
            this.count = 1024;
        }
        if (keytype == KeyType.BUTTON) {
            this.count = 10000;
        }
        if (keytype == KeyType.DIAL) {
            this.count = 30000;
        }
        if (keytype == KeyType.FINGER) {
            this.count = 1000000;
        }
    }

    public void put(T data) {
        this.data = data; // 금고 안에 넣을 것
    }

    public T get() {
        count--;
        if (count<0) {
            return this.data;
        }
        return null;
    }

    // 제네릭은 타입에 제한을 두고
    // enum은 input에 제한을 건다

    public static void main(String[] args) {

        StrongBox<String> 금고 = new StrongBox<>(KeyType.BUTTON);
        금고.put("힘");

        for (int i = 0; i < 10002; i++) {
            System.out.println(금고.get());

        }
    }

}


