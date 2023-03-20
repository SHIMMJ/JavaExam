package com.simminjeong.praticeex.exam15;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        
        try  {
            String s = null;
            s.length();

        } catch (NullPointerException n) {
            System.out.println("null값임");
            n.printStackTrace();
        }
    }
}


