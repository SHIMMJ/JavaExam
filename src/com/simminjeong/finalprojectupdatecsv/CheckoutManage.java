package com.simminjeong.finalprojectupdatecsv;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.simminjeong.finalprojectupdatecsv.CheckoutInfo;

public class CheckoutManage {

	public static List<CheckoutInfo> checkoutinfos = new ArrayList<>();

	// 대출목록에 추가
	public void create(CheckoutInfo checkinfo) {
		checkoutinfos.add(checkinfo);
	}
	
	// 대출 시간 반납시간 설정
	public void setCheckoutDate(CheckoutInfo checkinfo) {
		
		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		checkinfo.setCheckoutdate(calendar.getTime());
		calendar.add(Calendar.DATE, 14);
		checkinfo.setDeadlinedate(calendar.getTime());
		checkinfo.setRentExtentionState(false);
			
	}

	// 대출 목록 출력
	public void select() {
		for (CheckoutInfo cinfo : checkoutinfos) {
			System.out.println(cinfo);
		}
	}

	// 대출 목록에 저장된 정보인지확인
	public CheckoutInfo select(String name, String title) {
		for (CheckoutInfo cinfo : checkoutinfos) {
			if (cinfo.getName().equals(name) && cinfo.getTitle().equals(title)) {
				return cinfo;
			}
		}
		return null;
	}
	
	
//	public void setCheckout (String name, String title) {
//		for (CheckoutInfo cinfo : checkoutinfos) {
//			if (cinfo.ge)
//		}
//		
//		
//	}
	
	

	// 대출 연장
	public static void setDelayDeadline(CheckoutInfo ckin) {
		if (!ckin.isRentExtentionState()) {
			Date date = ckin.getDeadlinedate();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.DATE, 7);
			ckin.setDeadlinedate(calendar.getTime());

		} else {
			System.out.println("연장 불가");
			return;
		}
	}

	// 반납
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
