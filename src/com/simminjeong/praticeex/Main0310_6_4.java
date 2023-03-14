package com.simminjeong.praticeex;

import java.util.Random;
import java.util.Scanner;

public class Main0310_6_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long tries = scanner.nextInt();
        int hits = 0;

        for (int i = 0; i < tries; i++) {
            double x = new Random().nextDouble() * 2 - 1;
            double y = new Random().nextDouble() * 2 - 1;

            double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

            if (distance <= 1) {
                hits = hits + 1;
            }
        }

        double piEstimate = 4 * (double) hits / tries; // 4.0으로 써도됨
        System.out.println(piEstimate);

    }
}
