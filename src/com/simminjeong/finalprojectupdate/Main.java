package com.simminjeong.finalprojectupdate;

import java.util.Scanner;
import com.simminjeong.finalprojectupdate.BookInfo;
import com.simminjeong.finalprojectupdate.CheckoutInfo;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserManage usermanager = new UserManage();
        BookManage bookmanager = new BookManage();
        CheckoutManage checkoutmanager = new CheckoutManage();

        boolean isExit = false;
        while (!isExit) {
            
            
            System.out.println("기능을 선택해주세요. 1. 회원관리 2. 도서관리 3. 대출 4. 종료 ");

            int target = scanner.nextInt();

            if (target == 1) {
                usermanager.userPrint();
            } 
            else if (target == 2) {
                bookmanager.bookPrint();
            } 
            else if (target == 3) {
            	
                
            } else if (target == 4) {
                System.exit(0);
            }



        }



    }

}
