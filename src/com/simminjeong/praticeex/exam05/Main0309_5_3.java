package com.simminjeong.praticeex.exam05;

public class Main0309_5_3 {

    public static void email(String address, String title, String text) {
        System.out.println(address + "에 아래의 메일을 송신한다.");
        System.out.println("제목 : " + title);
        System.out.println("본문 : " + text);
    }

    public static void email(String address, String text) {
        email(address, "제목 없음", text);
    }

    public static void main(String[] args) {
        email("simminjeong@naver.com", "안녕하세요~ 반갑습니다");
        email("simminjeong@naver.com", "인사", "안녕하세요~ 반갑습니다");

    }

}
