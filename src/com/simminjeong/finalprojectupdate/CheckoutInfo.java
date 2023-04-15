package com.simminjeong.finalprojectupdate;

import java.util.Calendar;
import java.util.Date;

public class CheckoutInfo {

	private String name;
	private String title;
	private Date checkoutdate;
	private Date deadlinedate;
	private boolean rentExtentionState; // 반납 연장 상태

	public CheckoutInfo(String name, String title, Date checkoutdate, Date deadline, boolean rentExtentionState) {
		this.name = name;
		this.title = title;
		this.checkoutdate = checkoutdate;
		this.deadlinedate = deadline;
		this.rentExtentionState = rentExtentionState;
	}

	public CheckoutInfo(String name, String title) {
		this.name = name;
		this.title = title;

		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		this.checkoutdate = checkoutdate;
		calendar.add(Calendar.DATE, 14);
		this.deadlinedate = deadlinedate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCheckoutdate() {
		return checkoutdate;
	}

	public void setCheckoutdate(Date checkoutdate) {
		this.checkoutdate = checkoutdate;
	}

	public Date getDeadlinedate() {
		return deadlinedate;
	}

	public void setDeadlinedate(Date deadlinedate) {
		this.deadlinedate = deadlinedate;
	}

	public boolean isRentExtentionState() {
		return rentExtentionState;
	}

	public void setRentExtentionState(boolean rentExtentionState) {
		this.rentExtentionState = rentExtentionState;
	}

	@Override
	public String toString() {
		return "CheckoutInfo [name=" + name + ", title=" + title + ", checkoutdate=" + checkoutdate + ", deadlinedate="
				+ deadlinedate + ", rentExtentionState=" + rentExtentionState + "]";
	}

}
