package com.simminjeong.praticeex.examup7;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {

        Reader fr = new FileReader("gradle.properties");
        Properties prop = new Properties();
        prop.load(fr); // 파일은 읽어드림

        String name = prop.getProperty("android.useAndroidX");
        
        System.out.println("값 : "+name);
        fr.close();
    }
}
