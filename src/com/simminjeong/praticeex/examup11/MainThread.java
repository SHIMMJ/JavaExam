package com.simminjeong.praticeex.examup11;

class CountUpThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 51; i++) {
            System.out.println(i);
        }
    }
}

public class MainThread {

    public static void main(String[] args) {

        Thread thread1 = new CountUpThread();
        thread1.start();

        Thread thread2 = new CountUpThread();
        thread2.start();

        Thread thread3 = new CountUpThread();
        thread3.start();

    }

}
