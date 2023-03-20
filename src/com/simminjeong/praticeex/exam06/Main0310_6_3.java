package com.simminjeong.praticeex.exam06;

public class Main0310_6_3 {

    public static void main(String[] args) {

        String[][] arr = new String[12][60];
        // ijk
        for (int i = 1; i < 13; i++) {
            for (int j = 0; j < 6; j++) {
                for (int z = 0; z < 10; z++) {
                    arr[i - 1][(j * 10) + z] = (i + ":" + j + z);
                }
            }
        }
        for (int b = 0; b < 60; b++) {
            for (int a = 0; a < 12; a++) {
                System.out.print(arr[a][b] + " ");
            }
            System.out.println();
        }


        // 간단버전
        // for (int j = 0; j < 60; j++) {
        // for (int i = 1; i < 13; i++) {
        // System.out.printf("%d:%02d ", i, j);
        // }
        // System.out.println();
        // }

    }

}
