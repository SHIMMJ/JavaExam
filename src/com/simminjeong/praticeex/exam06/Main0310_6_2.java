package com.simminjeong.praticeex.exam06;

public class Main0310_6_2 {

    public static void main(String[] args) {

        String format = "%d * %d = %2d \t";
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf(format, j, i, i * j);
            }
            System.out.println();
        }
    }
}
