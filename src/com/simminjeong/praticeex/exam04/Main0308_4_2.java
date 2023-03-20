package com.simminjeong.praticeex.exam04;

public class Main0308_4_2 {

    public static void main(String[] args) {

        int[] moneyList = {121902, 8302, 55100};
        // for 문
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }
        // foreach문
        for (int money : moneyList) {
            System.out.println(money);
        }

    }

}
