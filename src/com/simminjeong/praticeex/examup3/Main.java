package com.simminjeong.praticeex.examup3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws ParseException {

        Set<Book> setbooks = new HashSet<>();

        List<Book> listbooks = new ArrayList<>();

        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");


        listbooks.add(new Book("가자", format.parse("2011/10/22"), "재밌어요"));
        listbooks.add(new Book("누가 내 머리에 똥쌌어", format.parse("2022/04/02"), "즐거워요"));
        listbooks.add(new Book("좋은날", format.parse("2020/05/09"), "굿굿"));



        Book book1 = new Book("가자", format.parse("2011/10/22"), "재밌어요");
        Book book2 = new Book("누가 내 머리에 똥쌌어", format.parse("2022/04/02"), "즐거워요");
        Book book3 = new Book("누가 내 머리에 똥쌌어", format.parse("2022/04/02"), "안즐거워요");

        setbooks.add(book1);
        setbooks.add(book2);
        setbooks.add(book3);


        // (1) 제목과 출간일이 같으면 같은 책으로 판단한다. 또한 HashSet 등의 컬렉션에 넣어도 동일 객체로 판단한다.

        // equals비교
        if (book2.equals(book3)) {
            System.out.println("같아요");
        } else {
            System.out.println("달라요");
        }


        // hashcode()비교
        System.out.println(setbooks);

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());


        // (2) Book 인스턴스를 담고 있는 컬렉션에 대해 Collections.sort() 를 사용하면 출간일이 오래된 순서대로 정렬된다.
        Collections.sort(listbooks);
        System.out.println(listbooks);

        // (3) clone() 메서드를 호출하면 복제된다.
        System.out.println(book1);
        System.out.println(book1.clone());


    }

}
