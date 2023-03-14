package com.example;

import java.util.Random;
import java.util.Scanner;

public class Main0310 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();// 공사 현장의 x 좌표
        int b = scanner.nextInt();// 공사 현장의 y 좌표
        int R = scanner.nextInt();// 공사장 소음의 크기
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int x_i = scanner.nextInt();
            int y_i = scanner.nextInt();

            double distance = Math.pow(a - x_i, 2) + Math.pow(b - y_i, 2);

            if (distance >= Math.pow(R, 2)) {
                System.out.println("silent");
            } else {
                System.out.println("noisy");
            }
        }

    }
}
