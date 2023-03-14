package com.example;

import java.util.Scanner;

public class Main0307 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String sen = "";
        
        for (int i = 0; i < 3; i++) {
            String word = scanner.nextLine();
            sen += word + ",";
        }
        System.out.println(sen.replaceAll(",$", "."));
        // f3
         String result = "";// string은 한번 값이 할당되면 변경이 안됨
         for (int i = 0; i < 5; i++) {
         result = result + (i + ",");// 새로운 메모리를 계속해서 생성하는 것
         // 주소가 다르고 객체도 다름. 오래걸려
         // ->StringBuiler는 새롭게 객체 생성안하고 계속해서 뒤에 붙여주는것
         // 번외)StringBuiler 와 StringBuffer의 차이
        
         }
         System.out.println(result);
         
    }
}
