package com.simminjeong.praticeex.examup08;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedInputStream in = new BufferedInputStream(new URL("https://alimipro.com/favicon.ico").openStream());
        FileOutputStream fileOutputStream = new FileOutputStream("output.ico");{
            
            byte dataBuffer[] = new byte[1024];
            int byteRead;
            
            while((byteRead = in.read(dataBuffer,0,1024))!=-1) {
                fileOutputStream.write(dataBuffer,0,byteRead);
            }
        }
        
    }

}
