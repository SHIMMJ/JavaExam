package com.simminjeong.praticeex.examup10;

public class Main {

    public static void main(String[] args) {

        System.out.println("테스트 시작");
        Account account = new Account("홍길동", 30000);
        System.out.println(account);
        System.out.println("테스트 끝");

        Account account1 = new Account("한석봉", 0);
        account.transfer(account1, Integer.MAX_VALUE + 1);

        if (account1.getBalance() == 2147483648L) { //2147483648
            System.out.println("getbalance 값 다름");
        }
        System.out.println("테스트 끝");
        
    }
}
