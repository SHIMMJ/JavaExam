package com.example;

import java.util.Scanner;

import java.util.Scanner;

public class MainMethod {

    public static int[] plus(int m, int n) {
        int[] arr_tmp = new int[10];
        for (int i = 0; i < 10; i++) {
            arr_tmp[i] = m + (n * i);
        }
        return arr_tmp;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] arr = plus(m, n);

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i]);
            }

        }
    }
}


// f2 문서보기
// f3 해당 메서드 선언된 곳으로 간다.
