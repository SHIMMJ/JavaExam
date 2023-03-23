package com.simminjeong.finalproject;

public class CheckoutInfo {
	
	private String name;
	private String title;
	private String checkoutdate;
	private String deadlinedate;
	
	public CheckoutInfo(String name, String title) {
		this.name = name;
		this.title = title;
	}
	

	public CheckoutInfo(String name, String title, String checkoutdate, String deadline) {
		this.name = name;
		this.title = title;
		this.checkoutdate = checkoutdate;
		this.deadlinedate = deadline;
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

	public String getCheckoutdate() {
		return checkoutdate;
	}

	public void setCheckoutdate(String checkoutdate) {
		this.checkoutdate = checkoutdate;
	}

	public String getReturndate() {
		return deadlinedate;
	}

	public void setReturndate(String deadlinedate) {
		this.deadlinedate = deadlinedate;
	}
	

	@Override
	public String toString() {
		return "CheckoutInfo [name=" + name + ", title=" + title + ", checkoutdate=" + checkoutdate + ", deadline="
				+ this.deadlinedate;}
	
	
	

}
