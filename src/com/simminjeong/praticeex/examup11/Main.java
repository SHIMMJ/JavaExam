package com.simminjeong.praticeex.examup11;

import java.util.Scanner;

class PrintingThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 51; i++) {
            System.out.println(i);
        }
    }
}


// class PrintingThread2 implements Runnable {
//
// @Override
// public void run() {
// // TODO Auto-generated method stub
//
// }
//
// }


public class Main {

    public static void main(String[] args) {

        System.out.println("thread : "+Thread.currentThread().getName());

        System.out.println("키 입력");
        Scanner scanner = new Scanner(System.in);
        //
        // Thread thread = new PrintingThread();
        // thread.start();
        //



        new Thread(new Runnable() {
            
            
            @Override
            public void run() {
                System.out.println("thread : "+Thread.currentThread().getName());

            }

        }).start();

        new Thread(() -> {
            System.out.println("thread : "+Thread.currentThread().getName());

            System.out.println("ggg");
        }).start();

        scanner.nextLine();

    }

}
