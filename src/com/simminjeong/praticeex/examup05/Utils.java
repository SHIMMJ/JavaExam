package com.simminjeong.praticeex.examup05;

import java.util.function.IntBinaryOperator;

public class Utils {

    // 함수 저장용 인터페이스 선언
    interface Func1 {
        boolean isOdd(int n);
    }

    interface Func2 {
        String addNamePrefix(boolean male, String name);
    }


    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static String addNamePrefix(boolean male, String name) {
        if (male == true) {
            return "Mr." + name;
        }
        return "Ms." + name;
    }

    public static void main(String[] args) {
        
        
//         문제 1
//         Func1 func1 = Utils::isOdd;
//         Func2 func2 = Utils::addNamePrefix;
//         
//         boolean result1 = func1.isOdd(6);
//         System.out.println(result1);
//
//         String result2 = func2.addNamePrefix(false, "심민정");
//         System.out.println(result2);



         
//        문제2
        Func1 fucn1 = (int n) -> {
            return n % 2 == 1;
        };

        Func2 fucn2 = (boolean male, String name) -> {
            if (male == true) {
                return "Mr." + name;
            }
            return "Ms." + name;
        };

        Utils func1 = null;
        Utils func2 = null;
        boolean result1 = func1.isOdd(6);
        System.out.println(result1);

        String result2 = func2.addNamePrefix(false, "심민정");
        System.out.println(result2);

    }

}
