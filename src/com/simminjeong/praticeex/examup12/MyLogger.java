package com.simminjeong.praticeex.examup12;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public final class MyLogger {

    private static FileWriter fw;
    private static BufferedWriter bw;

    // static을 통해 class가 로드될때 객체를 생성
    private static MyLogger instance;

    private MyLogger() {} // 생성자에 접근 X. new 금지

    // 객체가 존재하지 않으면 생성해주고 존재하면 기존 객체를 반환
    public static MyLogger getInstance() throws Exception {

        if (instance == null) {
            // synchronized(인스턴스 변수 혹은 클래스 타입)
            // 특정 영역만 동기화, 메서드 영역보다 범위가 작음
            instance = new MyLogger();
            fw = new FileWriter("dummylog.txt");
            bw = new BufferedWriter(fw);
            System.out.println("파일 열기");

        }
        return instance;
    }

    public void log(String str) throws IOException {

        bw.write(str);
        bw.flush();
        System.out.println("작성");
        
    }

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("dummylog.txt");
        MyLogger logger1 = MyLogger.getInstance();
        logger1.log("first");
        MyLogger logger2 = MyLogger.getInstance();
        logger2.log("second");
    }

}
