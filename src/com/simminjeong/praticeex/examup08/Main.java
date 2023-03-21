package com.simminjeong.praticeex.examup08;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedInputStream in = new BufferedInputStream(new URL("https://alimipro.com/favicon.ico").openStream());
    }

}
