package com.simminjeong.praticeex.exam05;

public class Main0309_5_4 {

    public static double calcTriangleArea(double bottom, double height) {
        double area = bottom * height * 0.5;
        return area;
    }

    public static double calcCircleArea(double radius) {
        double area = Math.pow(radius, 2) * 3.14; // Math.PI
        return area;
    }

    public static void main(String[] args) {

        double trianglearea = calcTriangleArea(4, 3);
        double circlearea = calcCircleArea(2);

        System.out.println("삼각형의 면적 : " + trianglearea + "cm²");
        System.out.println("원의 면적 : " + circlearea + "cm²");

    }

}
