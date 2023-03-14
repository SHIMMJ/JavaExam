package com.simminjeong.praticeex;

import java.util.Arrays;

public class Main0308_4_4 {

    public static void main(String[] args) {


//        int[] numbers = {3, 4, 9};
//        System.out.println("1자리의 숫자를 입력 해 주세요");
//        int input = new java.util.Scanner(System.in).nextInt();
//
//        int idx = Arrays.binarySearch(numbers, input);
//
//        if (idx >= 0) {
//            System.out.println("정답");
//        } else {
//            System.out.println("오답");
//        }


        int[] numbers = {3, 4, 9};
        System.out.println("1자리의 숫자를 입력 해 주세요");
        int input = new java.util.Scanner(System.in).nextInt();

        int idx = Arrays.binarySearch(numbers, input);

        if (idx >= 0) {
            System.out.println("정답");
        } else {
            System.out.println("오답");
        }
    }

}
