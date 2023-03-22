package com.simminjeong.praticeex.examup11;

public class Counter {

    private long count = 0;

    public synchronized void add(long i) {
        System.out.println("더하기");
        count += i;
    }

    public synchronized void mul(long i) {
        System.out.println("곱하기");
        count *= i;
    }

    public static void main(String[] args) throws Exception {

        Counter counter = new Counter();
        new Thread(() -> {
            counter.add(3);
        }).start();

        new Thread(() -> {
            counter.mul(3);
        }).start();
        
        Thread.sleep(5000);
        System.out.println(counter.count);

    }

}
