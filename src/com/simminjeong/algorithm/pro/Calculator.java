package com.simminjeong.algorithm.pro;

public class Calculator {

    public static double calculatorDistance(int treex, int treey, int conx, int cony) {
        return Math.sqrt(Math.pow(treex - conx, 2) + Math.pow(treey - cony, 2));
    }



}
