package com.example;

public class Stringuse {

    public static void main(String[] args) {
        
        String s1 = "HELLO";

        System.out.println(s1.substring(0, 2)); // HE
        System.out.println(s1.substring(2)); // LLO

        // (중요) String은 불변!!! 변하지 않는다.!!!
        System.out.println(s1.replace("LL", "XX")); // HEXXO
        System.out.println(s1); // HELLO

        String splited[] = s1.split(",");
        
        //소문자
        System.out.println(s1.toLowerCase()); // hello
        
        System.out.println(s1.indexOf('L')); // 2(앞에서부터)
        System.out.println(s1.lastIndexOf('L')); // 3(뒤에서부터)
        
        System.out.println(s1.isEmpty()); //길이가 0인지
        
//        s1.contains() : 포함 관계
//        s1.endsWith() : 끝나는 단어가 맞는지
//        s1.indexOf() : 단어가 몇 번째에 있는지
//        s1.lastIndexOf() : 뒤에서 몇 번째에 단어가 있는지
        
        System.out.println(s1.trim());// 좌우 공백 제거
        System.out.println(s1.replace("H", "HH"));

    }

}
