package com.simminjeong.praticeex.exam15;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        try (FileWriter fw = new FileWriter("data/data.txt")) {

            fw.write("hello");


        } catch (IOException e) {
            System.out.println("에러 발생");


        }
    }
}
