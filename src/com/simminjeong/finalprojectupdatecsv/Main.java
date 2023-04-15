package com.simminjeong.finalprojectupdatecsv;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

import com.simminjeong.finalprojectupdatecsv.CheckoutInfo;

public class Main {

	private static final String CheckoutInfo = null;

	public static void main(String[] args) throws ParseException, Exception {

		Scanner scanner = new Scanner(System.in);

		UserManage usermanager = new UserManage();
		BookManage bookmanager = new BookManage();
		CheckoutManage checkoutmanager = new CheckoutManage();

//		SaveCsvUtil.csvToBook();
//		SaveCsvUtil.csvToUser();
//        SaveCsvUtil.csvToCheckOut();

		boolean isExit = false;
		while (!isExit) {

			System.out.println("기능을 선택해주세요      1. 회원관리   2. 도서관리   3. 대출관리   4. 종료 ");

			int target = scanner.nextInt();

			if (target == 1) {

				usermanager.userPrint();

			} else if (target == 2) {

				bookmanager.bookPrint();

			} else if (target == 3) {

				boolean isExitco = false;

				while (!isExitco) {

					System.out.println("0. 뒤로   1. 대출가능책보기   2. 대출하기   3. 반납하기   4. 대출연장   5. 대여목록  6. 전체소장도서보기");
					int checkoutbook = scanner.nextInt();

					switch (checkoutbook) {

					case 0:
						System.out.println("뒤로");
						isExitco = true;
						break;

					case 1: // 대출가능책보기

						bookmanager.select();
						break;

					case 2: // 대출하기

						System.out.println("이름이 뭐에요");
						String name = scanner.next();
						System.out.println("대여할 책 제목을 입력하세요");
						String title = scanner.next();
						BookInfo binfo = bookmanager.select(title);

						if (binfo != null) {
							
							
							CheckoutInfo checkinfo=new CheckoutInfo();

							checkoutmanager.setCheckoutDate(checkinfo);
							checkoutmanager.create(new CheckoutInfo(name, title, checkinfo.getCheckoutdate(),
									checkinfo.getDeadlinedate(), checkinfo.isRentExtentionState()));

							break;
						} else {
							System.out.println("대출불가입니다. 다른 책을 제목을 입력하세요");
						}

					case 3: // 반납하기

						System.out.println("반납");
						System.out.println("이름이 뭐에요");
						String deletename = scanner.next();
						System.out.println("반납할 책 제목을 말하세요");
						String deletebook = scanner.next();
						bookmanager.returnbook(deletebook);
						checkoutmanager.delete(deletename, deletebook);

						break;

					case 4: // 대출연장

						System.out.println("대출 연장");
						System.out.println("이름이 뭐에요");
						String delayname = scanner.next();
						System.out.println("연장할 책 제목을 입력하세요");
						String delaytitle = scanner.next();

						CheckoutInfo coinfo = checkoutmanager.select(delayname, delaytitle);

						if (coinfo != null) {
							checkoutmanager.setDelayDeadline(coinfo);
							coinfo.setRentExtentionState(true);
						}
						break;

					case 5: // 대여목록

						System.out.println("대여목록");
						checkoutmanager.select();
						break;

					case 6: // 전체소장도서보기

						bookmanager.selectAll();
						break;

					}
				}
			} else if (target == 4) {

				SaveCsvUtil.UserToCsv();
				SaveCsvUtil.bookToCsv();
				SaveCsvUtil.checkOutToCsv();

				System.exit(0);
			}

		}

	}

}
