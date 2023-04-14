package com.simminjeong.finalprojectupdate;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BookInfo {

	private String id;
	private String title;
	private String writer;
	private String publisher;
	private boolean available;


	public BookInfo(String id, String title, String writer, String publisher) {
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.available = true;
	}
	


    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "BookInfo [id=" + id + ", title=" + title + ", writer=" + writer + ", publisher=" + publisher
				+ ", available=" + available + "]";
	}

}
