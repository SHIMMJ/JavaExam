package com.simminjeong.finalprojectupdatecsv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CheckoutManage {

	
//	private String checkoutdate;
//	private String deadlinedate;
	private CheckoutInfo checkoutinfo;

	public static List<CheckoutInfo> checkoutinfos = new ArrayList<>();

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
		checkoutinfo.setDeadlinedate(format.format(now));
	}
	
	public String getCheckoutdate() {
	    return this.checkoutinfo.getCheckoutdate();
	}
	
	public String getDeadlinedate() {
        return this.checkoutinfo.getDeadlinedate();
    }

	public void setDeadline() {

		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DATE, 14);
		Date date = calendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		checkoutinfo.setDeadlinedate(format.format(date));
	}


	public void setDelayDeadline(String beforedeadline) {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		try {
			date = formatter.parse(beforedeadline);
			System.out.println(date);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(calendar.DAY_OF_MONTH, 7);
		Date newdeadlinedate = calendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("여기");
		checkoutinfo.setDeadlinedate(format.format(newdeadlinedate));
		System.out.println("저기");
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
