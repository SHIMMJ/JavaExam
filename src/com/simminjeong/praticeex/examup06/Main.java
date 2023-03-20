package com.simminjeong.praticeex.examup06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String msg="hello world";
        Reader reader=new StringReader(msg);
        reader.read();
        reader.close();
        
    }



    public static String fileRead(String filename) throws IOException,ClassNotFoundException {
        String result = "";
        FileReader fr = new FileReader(filename);

        int ch = fr.read();
        while (ch != -1) {
            System.out.println((char) ch); // 한글자 가져오기
            ch = fr.read();
        }
        fr.close();

        return result;
    }

    public static void fileWriteCode() throws IOException {
        FileWriter fw = new FileWriter("data.txt", true);
        // true 기존에 파일이 있다면 뒤에 붙여라
        // false면 새로 파일을 만듬

        fw.write("hello world");
        fw.flush(); // 파일 쓰기 꼭 해줘라!!!
        fw.close(); // 파일 닫기

    }

}
