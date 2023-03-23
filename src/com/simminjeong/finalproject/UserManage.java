package com.simminjeong.finalproject;

import java.util.ArrayList;

public class UserManage {

	private ArrayList<UserInfo> users = new ArrayList<>();

	public ArrayList<UserInfo> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<UserInfo> users) {
		this.users = users;
	}

	public void create(UserInfo user) {
		users.add(user);
	}

	public void select() {
		if (users.size() == 0) {
			System.out.println("등록된 회원이 아무도 없어요");
		}
		for (UserInfo ui : users) {
			System.out.println(ui);
		}

	}

	public UserInfo select(String name) {
		for (UserInfo ui : users) {
			if (ui.getName().equals(name)) {
				return ui;
			}
		}
		return null;
	}

	public void update(String updatename, String updateelement, String updatevalue) {
		boolean found = false;
		for (UserInfo ui : users) {

			if (ui.getName().equals(updatename)) {
				found = true;

				if (updateelement.equals("주소")) {
					ui.setAddress(updatevalue);
					System.out.println(ui.getAddress());
				} else if (updateelement.equals("핸드폰")) {
					ui.setPhonenumber(updatevalue);
					System.out.println(ui.getPhonenumber());
				} else {
					System.out.println("변경은 주소와 핸드폰만 가능합니다.");
					System.out.println("그 외의 경우 삭제하고 다시 등록해주세요");
				}
			}
		}
		if (!found) {
			System.out.println("해당 이름은 없어요");
		}

	}

	public void delete(String deletename) {
		boolean found = false;
		for (UserInfo ui : users) {

			if (ui.getName().equals(deletename)) {
				found = true;
				users.remove(ui);
				break;
			}
		}
		if (!found) {
			System.out.println("해당 이름은 없어요");
		}
	}

}
