package com.example;

import java.util.Arrays;

public class MainArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // int[] scores = new int[5];
        // int count = scores.length;
        
        
        
        
        long beforeTime = System.currentTimeMillis();
        
        
        int[] numbers = {3, 4, 9};
        System.out.println("1자리의 숫자를 입력 해 주세요");
        int input = new java.util.Scanner(System.in).nextInt();

        for (int num : numbers) {
            if (input == num) {
                System.out.println("정답");
                break;
            }
        }//안됨
        

            
        long afterTime = System.currentTimeMillis(); 
        long secDiffTime = (afterTime - beforeTime)/1000;
        System.out.println("시간차이(m) : "+secDiffTime);



//        int[] numbers = {3, 4, 9};
//        System.out.println("1자리의 숫자를 입력 해 주세요");
//        int input = new java.util.Scanner(System.in).nextInt();
//
//        int idx = Arrays.binarySearch(numbers, input);
//        System.out.println(idx);
        // if (idx >= 0) {
        // System.out.println("dd");
        // } else {
        // System.out.println("x");
        // }


        // for (int num : numbers) {
        // if (input == num) {
        // System.out.println("정답");
        // break;
        // } else {
        // System.out.println("오답");
        // break;
        // }
        // }
        //



        // if (contains(numbers, input)) {
        // System.out.println("정답");
        // } else {
        // System.out.println("오답");
        // }
        //
        // }
        //
        // private static boolean contains(int[] numbers, int input) {
        // // TODO Auto-generated method stub
        //
        // return true;
        // }

        // null은 가리키고
        // 있는 화살표를 지워버린다.



    }
}
// debug모드
// 한줄한줄 f6
// f8은 . 만
