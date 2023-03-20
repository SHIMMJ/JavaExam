package com.simminjeong.praticeex.exam05;

public class Main0309_5_2 {

    public static void mail(String title, String address, String text) {
        System.out.println(title + "에 아래의 메일을 송신한다.");
        System.out.println("제목 : " + address);
        System.out.println("본문 : " + text);
    }

    public static void main(String[] args) {
        mail("simminjeong@naver.com", "인사", "안녕하세요~ 반갑습니다");

    }

}
