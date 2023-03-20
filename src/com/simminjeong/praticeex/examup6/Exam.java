package com.simminjeong.praticeex.examup6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

// java.util.zip.GZIPOutputStream 을 사용하여 압축한다.
// 버퍼링을 수행하시오.
// 예외처리를 하시오.


public class Exam {

    public static void main(String[] args) {

        // FileInputStream input = null;
        // FileOutputStream output = null;

        // input = new FileInputStream("data.txt");
        // output = new FileOutputStream("data2.txt");
        try {
            // 압축
            BufferedReader input = new BufferedReader(new FileReader("data.txt"));

            BufferedOutputStream output = new BufferedOutputStream(
                    new GZIPOutputStream(new FileOutputStream("test1.zip")));
            System.out.println("Writing file");

            int readInt = 0;
            while (readInt != -1) {
                readInt = input.read();
                output.write((char) readInt);
            }
            input.close();
            output.close();


            // 압출 풀기
            BufferedReader in2 = new BufferedReader(
                    new InputStreamReader(new GZIPInputStream(new FileInputStream("test1.zip"))));

            BufferedOutputStream out2 =
                    new BufferedOutputStream(new FileOutputStream("testunzip1.txt"));

            String s;

            while ((s = in2.readLine()) != null) {
                System.out.println(s);
                out2.write(s.getBytes());
                out2.write("\n".getBytes());
            }

            in2.close();
            out2.close();
        } catch (Exception e) {
            System.out.println("에러 발생");
        }
    }
}
