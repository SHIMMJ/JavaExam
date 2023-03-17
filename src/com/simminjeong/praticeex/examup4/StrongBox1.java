package com.simminjeong.praticeex.examup4;

public class StrongBox1<T> {

    private T data;

    public void put(T data) {
        this.data = data;
    }

    public T get() {
            return this.data;  
    }
    
    // 제네릭은 타입에 제한을 두고
    // enum은 input에 제한을 건다
}


