package com.simminjeong.finalprojectupdatecsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManage {

//	public BookInfo bookinfo;

	public static List<BookInfo> books = new ArrayList<>();

	public List<BookInfo> getBooks() {
		for (BookInfo ss : books) {
			System.out.println(ss);
		}
		return books;
	}

	public void setBooks(List<BookInfo> books) {
		this.books = books;
	}

	public void create(BookInfo book) {
		books.add(book);
	}

	public void selectAll() {

		for (BookInfo bi : books) {
			System.out.println(bi);
		}
	}

	public void select() {
		for (BookInfo bi : books) {
			if (bi.getisAvailable()) {

				System.out.println(bi);
			}
		}
	}

	public BookInfo select(String title) {
		for (BookInfo bi : books) {
			if (bi.getTitle().equals(title) && (bi.getisAvailable())) {
				System.out.println(bi.getTitle() + " 대출");
				bi.setAvailable(false);

				return bi;

			}
		}

		return null;
	}
	
	
	
	public BookInfo returnbook(String title) {
        for (BookInfo bi : books) {
            if (bi.getTitle().equals(title)) {
                System.out.println(bi.getTitle() + " 반납");
                bi.setAvailable(true);

                return bi;

            }
        }

        return null;
    }
	
	
    
	
	

	public void delete(String deletebook) {
		boolean found = false;
		for (BookInfo ui : books) {

			if (ui.getTitle().equals(deletebook)) {
				found = true;
				books.remove(ui);
				break;
			}
		}
		if (!found) {
			System.out.println("해당 책은 없어요");
		}
	}
	
	
	public void bookPrint() {
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    boolean isExit = false;
	    while (!isExit) {

            System.out.println("0. 뒤로   1. 전체소장도서보기   2. 신규도서등록   3. 도서삭제");
            int bookchoice = scanner.nextInt();

            switch (bookchoice) {

            case 0:
   
                isExit=true;
                
                break;
                

            case 1:
                selectAll();
                break;


            case 2:
                System.out.println("id 책제목 저자 출판사");
                String id = scanner.next();
                String title = scanner.next();
                String writer = scanner.next();
                String publisher = scanner.next();
                Boolean available=true;
                create(new BookInfo(id, title, writer, publisher,available));
                break;

            case 3:
                System.out.println("도서삭제");
                System.out.println("책이름이 뭐에요");
                String deletebook = scanner.next();
                delete(deletebook);
                break;

            default:
                break;

            }

        }
	}
}
