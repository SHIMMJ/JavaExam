package com.simminjeong.praticeex.exam15;

public class Main {
    public static void main(String[] args) {
        String s = "Three";

        try {

            int i = Integer.parseInt(s);

        } catch (NumberFormatException n) {
            System.out.println("NumberFormatException 예외를 catch 하였습니다");
            System.out.println("정수로 반환할 수 없습니다.");
            
        }
    }
}

