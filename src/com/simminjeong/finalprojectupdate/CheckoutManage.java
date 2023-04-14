package com.simminjeong.finalprojectupdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CheckoutManage {

	private String deadlinedate;
	private String checkoutdate;
	private CheckoutInfo checkoutinfo;

	private List<CheckoutInfo> checkoutinfos = new ArrayList<>();

	public CheckoutManage() {
	}

	public void create(CheckoutInfo checkinfo) {
		checkoutinfos.add(checkinfo);
	}

	public void select() {
		for (CheckoutInfo cinfo : checkoutinfos) {
			System.out.println(cinfo);
		}
	}

	public CheckoutInfo select(String name, String title) {
		for (CheckoutInfo cinfo : checkoutinfos) {
			if (cinfo.getName().equals(name) && cinfo.getTitle().equals(title)) {
				return cinfo;
			}
		}
		return null;
	}

	public void setChekoutdate() {

		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		this.checkoutdate = format.format(now);
	}

	public void setDeadline() {

	    System.out.println("시작");
		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DATE, 14);
		System.out.println("+14");
		Date date = calendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		this.deadlinedate = format.format(date);
		System.out.println("끝");
	}

	public String getCheckoutdate() {
		return checkoutdate;
	}

	public String getDeadlinedate() {
		return this.deadlinedate;
	}

	public void setDelayDeadline(String beforedeadline) {
	    
	    System.out.println("delary");
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		try {
			date = formatter.parse(beforedeadline);
			System.out.println("delarytry");
			System.out.println(date);

		} catch (ParseException e) {
		    System.out.println("delarycatch");
			e.printStackTrace();
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(calendar.DAY_OF_MONTH, 7);
		Date newdeadlinedate = calendar.getTime();
		System.out.println("delaryddd");
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		this.deadlinedate = format.format(newdeadlinedate);
	}

	public void delete(String deletename, String deletebook) {
		boolean found = false;
		for (CheckoutInfo coi : checkoutinfos) {

			if (coi.getName().equals(deletename) && coi.getTitle().equals(deletebook)) {
				found = true;
				checkoutinfos.remove(coi);
				System.out.println("반납완료");
				break;
			}
		}
		if (!found) {
			System.out.println("대여목록에 없어요");
		}
	}


}
