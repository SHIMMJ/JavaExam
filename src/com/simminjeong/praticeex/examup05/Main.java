package com.simminjeong.praticeex.examup05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class Main {

    interface MyFunction {
        int call(int aaa, int bbb);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int gg(int a, int b) {
        return a + b;
    }

    public static List<String> getParkList(List<String> names) {
        return names.stream().filter(name -> name.startsWith("박")).collect(Collectors.toList());
                
        // List<String> results = new ArrayList<>();
        //
        // for (String name : names) {
        // if (name.startsWith("박")) {
        // results.add(name);
        // }
        // }
        //
        // return results;
    }



    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("박경덕");
        names.add("이동학");
        names.add("박준하");
        names.add("박태현");

        List<String> parks = getParkList(names);
        System.out.println(parks);

        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        // return이 없어야해
        nums.stream().forEach(num -> {
            System.out.println(num);
        });

        nums.stream().forEach(System.out::println);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                System.out.println(nums.get(i) + 1);
            }
        }

        // filter는 if문
        nums.stream().filter((num) -> num % 2 == 0)// 거르기
                .map((num) -> num + "번") // 변환
                // num이 들어오면 num+"번"이 나간다.
                .forEach((num) -> System.out.println(num + 1));


        IntBinaryOperator func = Main::add;
        MyFunction deohagi = Main::add;
        MyFunction deohagi2 = Main::gg;

        // 람다식 lambda expression
        // 익명함수라고 볼 수도 있다.
        // 그때그때 만들어서 사용 가능
        MyFunction addFunciont2 = (int a, int b) -> {
            return a + b;
        };

        MyFunction mutiply = (int a, int b) -> {
            return a * b;
        };

        MyFunction mutiply1 = (a, b) -> {
            return a * b;
        };

        System.out.println(addFunciont2.call(3, 5));
        System.out.println(mutiply.call(3, 5));


        call(deohagi, deohagi2);


        int result = func.applyAsInt(5, 3);
        System.out.println("5 + 3 = " + result);
    }

    private static void call(MyFunction deohagi, MyFunction deohagi2) {

    }
}
