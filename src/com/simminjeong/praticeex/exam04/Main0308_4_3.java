package com.simminjeong.praticeex.exam04;

public class Main0308_4_3 {

    public static void main(String[] args) {

        int[] counts = null;
        float[] heights = {171.3F, 175.0F};

        System.out.println(counts[1]);
        // java.lang.NullPointerException
        // counts배열에 null이 선언되어 참조하고 있는 메모리가 없다.

        System.out.println(heights[2]);
        // java.lang.ArrayIndexOutOfBoundsException
        // 배열의 인덱스 범위를 벗어난 예외
        // 배열의 인덱스는 0 ~ 변수의 길이-1

    }

}
