package com.simminjeong.praticeex.exam12pratice;

public class Main {

    public static void main(String[] args) {

        Book book = new Book("역행자", 12000, "black", "good");
        Computer computer = new Computer("노트북", 2000000, "blue", "samsung");

        System.out.println("이름 : " + book.getName());
        System.out.println("가격 : " + book.getPrice());
        System.out.println("색상 : " + book.getColor());
        System.out.println("isbn : " + book.getIsbn());
        System.out.println("무게 : " + book.getWeight());
        book.setWeight(5.2);
        System.out.println("무게 변경 : " + book.getWeight());
        System.out.println();
        System.out.println("이름 : " + computer.getName());
        System.out.println("가격 : " + computer.getPrice());
        System.out.println("색상 : " + computer.getColor());
        System.out.println("제작사 : " + computer.getMakerName());
        System.out.println("무게 : " + computer.getWeight());
        computer.setWeight(1.8);
        System.out.println("무게 변경 : " + computer.getWeight());

    }

}
