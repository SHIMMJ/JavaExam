package com.simminjeong.finalproject;

import java.util.ArrayList;
import java.util.List;

public class BookManage {

	private BookInfo bookinfo;

	private List<BookInfo> books = new ArrayList<>();

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
			if (bi.isAvailable()) {
				System.out.println(bi);
			}
		}
	}

	public BookInfo select(String title) {
//		boolean found = false;
		for (BookInfo bi : books) {
			if (bi.getTitle().equals(title) && (bi.isAvailable())) {
				System.out.println(bi.getTitle() + " 대출");
				bi.setAvailable(false);
//				found = true;
				return bi;

//			} else if (!(bi.getTitle().equals(title))) {
//				System.out.println("해당도서는 도서관에 없습니다.");
//				return null;
//
//			} else if (!(bi.isAvailable())) {
//				System.out.println("해당도서는 현재 대출할 수 없습니다.");
//				return null;
//			} else {
//				System.out.println("어떤 경우일까");
//				return null;
//			}

			}

		}
//		if (!found) {
//			System.out.println("해당 책은 대출할 수 없어요");
//			return null;
//		}
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
}
