package com.simminjeong.finalprojectupdatecsv;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserInfo {

	private String signupdate;
	private String name;
	private int age;
	private String address;
	private String phonenumber;
//	private Date birthday;
	private String birthday;
	private String sex;

	public UserInfo(String signupdate, String name, int age, String address, String phonenumber, String birthday, String sex) {
		this.signupdate = signupdate;
		this.name = name;
		this.age=age;
		this.address = address;
		this.phonenumber = phonenumber;
		this.birthday = birthday;
		this.sex = sex;
	}

	public String getSignupdate() {
		return signupdate;
	}

	// 오늘 일자 그대로 가입일자에 넣기
	public void setSignupdate(Date signupdate) {
		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		this.signupdate = format.format(date);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "UserInfo [signupdate=" + signupdate + ", name=" + name + ", age=" + age + ", address=" + address
				+ ", phonenumber=" + phonenumber + ", birthday=" + birthday + ", sex=" + sex + "]";
	}
	
	

}
