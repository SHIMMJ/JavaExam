package com.simminjeong.finalprojectupdate;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	
	
	public void userPrint() {
	    Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        
        while (!isExit) {

            System.out.println("0. 뒤로  1. 회원조회  2. 회원등록  3. 회원수정  4. 회원삭제  5. 삭제취소");
            int userchoice = scanner.nextInt();

            switch (userchoice) {

            case 0:
                System.out.println("뒤로");
                isExit=true;
                break;
                

            case 1:
                System.out.println("회원조회");
                select();
                break;

            case 2:
                System.out.println("회원가입날짜 이름 주소 전화번호 생일 성별");
                String signupdate = scanner.next();
                String name = scanner.next();
                String address = scanner.next();
                String phonenumber = scanner.next();
                String birthday = scanner.next();
                Boolean sex = scanner.nextBoolean();
                System.out.println("회원등록");
                create(new UserInfo(signupdate, name, address, phonenumber, birthday, sex));
                break;

            case 3:
                System.out.println("회원수정");
                System.out.println("이름이 뭐에요");
                String updatename = scanner.next();
                System.out.println("주소와 핸드폰 중에 4무엇을 바꿀것이에요?");
                String updateelement = scanner.next();
                System.out.println("뭐라고 수정할거에요?");
                String updatevalue = scanner.next();
                update(updatename, updateelement, updatevalue);
                break;

            case 4:
                System.out.println("회원삭제");
                System.out.println("이름이 뭐에요");
                String deletename = scanner.next();
                delete(deletename);
                break;

            case 5:
                System.out.println("삭제취소");
                break;

            default:
                System.out.println("0 ~ 5 까지 입력");
                break;
            }
        }
        
    }
	

}
