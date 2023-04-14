package com.simminjeong.finalprojectpro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserController userController = new UserController(new UserRepositoryImpl());

        boolean isExit = false;
        while (!isExit) {
            System.out.println("기능을 선택해주세요. 1. 회원관리 2. 도서관리 3. 대출 4. 종료 ");

            int target = scanner.nextInt();

            if (target == 1) {
                userController.printMenu();
            } else if (target == 2) {
                // bookController.printMenu();
            } else if (target == 3) {
                // 예약 컨드롤러.printmenu()
            } else if (target == 4) {
                System.exit(0);
            }


        }



    }

}
