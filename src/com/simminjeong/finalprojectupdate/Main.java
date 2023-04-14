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
                
                int checkoutbook = 10;

                while (checkoutbook != 0) {

                    System.out.println("0. 뒤로  1. 전체 소장 도서보기  2. 대출 가능 책 보기  3. 대출하기  4. 대여목록  5. 대출 연장  6. 반납");
                    checkoutbook = scanner.nextInt();

                    switch (checkoutbook) {

                    case 0:
                        System.out.println("뒤로");
                        break;

                    case 1:
                        bookmanager.selectAll();
                        break;

                    case 2:
                        bookmanager.select();
                        break;

                    case 3:
                        System.out.println("이름이 뭐에요");
                        String name = scanner.next();
                        System.out.println("대여할 책 제목을 입력하세요");
                        String title = scanner.next();
                        BookInfo binfo = bookmanager.select(title);

                        if (binfo != null) {
                            checkoutmanager.setChekoutdate();
                            checkoutmanager.setDeadline();
                            checkoutmanager.create(new CheckoutInfo(name, title, checkoutmanager.getCheckoutdate(),
                                    checkoutmanager.getDeadlinedate()));
                            break;
                        } else {
                            System.out.println("대출불가입니다. 다른 책을 제목을 입력하세요");
                        }

                    case 4:
                        System.out.println("대여목록");
                        checkoutmanager.select();
                        break;

                    case 5:
                        System.out.println("대출 연장");
                        System.out.println("이름이 뭐에요");
                        String delayname = scanner.next();
                        System.out.println("연장할 책 제목을 입력하세요");
                        String delaytitle = scanner.next();

                        CheckoutInfo coinfo = checkoutmanager.select(delayname, delaytitle);
                        if (coinfo != null) {
                            checkoutmanager.setDelayDeadline(checkoutmanager.getDeadlinedate());
                            coinfo.setReturndate(checkoutmanager.getDeadlinedate());
                        }
                        break;

                    case 6:
                        System.out.println("반납");
                        System.out.println("이름이 뭐에요");
                        String deletename = scanner.next();
                        System.out.println("반납할 책 제목을 말하세요");
                        String deletebook = scanner.next();
                        bookmanager.returnbook(deletebook);
                        checkoutmanager.delete(deletename, deletebook);
                        
                        break;
                    }
                }
            } else if (target == 4) {
                System.exit(0);
            }



        }



    }

}
