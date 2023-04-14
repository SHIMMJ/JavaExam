package com.simminjeong.finalproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserManage usermanager = new UserManage();
        BookManage bookmanager = new BookManage();
        CheckoutManage checkoutmanager = new CheckoutManage();

        Scanner scanner = new Scanner(System.in);

        int manage = 10;
        boolean setup = true;

        while (setup) {

            System.out.println("1. 회원관리  2.도서관리  3. 대출 및 반납  4. 종료");
            manage = scanner.nextInt();
            switch (manage) {

            case 1:
                int userchoice = 10;

                while (userchoice != 0) {

                    System.out.println("0. 뒤로  1. 회원조회  2. 회원등록  3. 회원수정  4. 회원삭제  5. 삭제취소");
                    userchoice = scanner.nextInt();

                    switch (userchoice) {

                    case 0:
                        System.out.println("뒤로");
                        userchoice = 0;
                        break;

                    case 1:
                        System.out.println("회원조회");
                        usermanager.select();
                        break;

                    case 2:
                        System.out.println("회원가입날짜 이름 주소 전화번호 생일 성별");
                        String signupdate = scanner.next();
                        String name = scanner.next();
                        String address = scanner.next();
                        String phonenumber = scanner.next();
                        String birthday = scanner.next();
                        Boolean sex = scanner.nextBoolean();
                        System.out.println("회원등록");
                        usermanager.create(new UserInfo(signupdate, name, address, phonenumber, birthday, sex));
                        break;

                    case 3:
                        System.out.println("회원수정");
                        System.out.println("이름이 뭐에요");
                        String updatename = scanner.next();
                        System.out.println("주소와 핸드폰 중에 4무엇을 바꿀것이에요?");
                        String updateelement = scanner.next();
                        System.out.println("뭐라고 수정할거에요?");
                        String updatevalue = scanner.next();
                        usermanager.update(updatename, updateelement, updatevalue);
                        break;

                    case 4:
                        System.out.println("회원삭제");
                        System.out.println("이름이 뭐에요");
                        String deletename = scanner.next();
                        usermanager.delete(deletename);
                        break;

                    case 5:
                        System.out.println("삭제취소");
                        break;

                    default:
                        System.out.println("0 ~ 5 까지 입력");
                        break;
                    }
                }

            case 2:
                int bookchoice = 10;

                while (bookchoice != 0) {

                    System.out.println("0. 뒤로  1. 전체소장도서보기  2. 대출가능 책 보기  3. 신규도서등록  4. 도서정보삭제");
                    bookchoice = scanner.nextInt();

                    switch (bookchoice) {

                    case 0:
                        System.out.println("뒤로");
                        userchoice = 0;
                        bookchoice = 0;
                        break;

                    case 1:
                        bookmanager.selectAll();
                        break;

                    case 2:
                        bookmanager.select();
                        break;

                    case 3:
                        System.out.println("id 책제목 저자 출판사");
                        String id = scanner.next();
                        String title = scanner.next();
                        String writer = scanner.next();
                        String publisher = scanner.next();
                        bookmanager.create(new BookInfo(id, title, writer, publisher));
                        break;

                    case 4:
                        System.out.println("도서삭제");
                        System.out.println("책이름이 뭐에요");
                        String deletebook = scanner.next();
                        bookmanager.delete(deletebook);
                        break;

                    default:
                        break;

                    }

                }

            case 3:

                int checkoutbook = 10;

                while (checkoutbook != 0) {

                    System.out.println("0. 뒤로  1. 전체 소장 도서보기  2. 대출 가능 책 보기  3. 대출하기  4. 대여목록  5. 대출 연장  6. 반납");
                    checkoutbook = scanner.nextInt();

                    switch (checkoutbook) {

                    case 0:
                        System.out.println("뒤로");
                        userchoice = 0;
                        bookchoice = 0;
                        checkoutbook = 0;
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
                        checkoutmanager.delete(deletename, deletebook);
                        break;
                    }
                }

            case 4:
                manage = 4;
                System.out.println("종료");
                setup = false;
                break;

            }
        }
    }
}
