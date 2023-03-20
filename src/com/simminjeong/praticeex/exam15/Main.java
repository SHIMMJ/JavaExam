package com.simminjeong.praticeex.exam15;

public class Main {
    public static void main(String[] args) {

        try {
            String s = null;
            s.length();

        } catch (NullPointerException n) {
            System.out.println("NullPointerException 예외를 catch 하였습니다");
            System.out.println("---- stack trace (여기부터) ----");
            n.printStackTrace();
            System.out.println("---- stack trace (여기까지) ----");
        }
    }
}

