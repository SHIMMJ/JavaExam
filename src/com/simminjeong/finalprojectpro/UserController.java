package com.simminjeong.finalprojectpro;

import java.util.Random;
import java.util.Scanner;

public class UserController {

    private UserRepository userRepository;

    private boolean isExit = false;

    private User recentDeletedUser;

    private Scanner scanner = new Scanner(System.in);

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void printMenu() {
        isExit = false;
        while (!isExit) {
            System.out.println("1. 유저등록 2. 유저목록 3. 유저수정 4. 유저삭제 5. 삭제취소 0. 뒤로");

            int target = scanner.nextInt();
            if (target == 1) {
                addUser();
            } else if (target == 2) {
                printUserList();
            } else if (target == 3) {
                userUpdate();
            } else if (target == 4) {
                removeUser();
            } else if (target == 5) {
                restoreUser();
            } else if (target == 0) {
                isExit = true;
            }
        }


    }

    private void addUser() {
        String name = String.valueOf(new Random().nextInt(1000));
        userRepository.addUser(new User(0, name, 0, 0, name, name, null, null));
    }

    private void userUpdate() {
        // userRepository.updateUser(recentDeletedUser);
    }



    private void removeUser() {
        System.out.println("몇 번 id 삭제?");
        int target = scanner.nextInt();

        recentDeletedUser = userRepository.findById(target);
        userRepository.deleteUser(recentDeletedUser);
        System.out.println(target + "이 지워졌습니다.");
    }


    private void restoreUser() {
        userRepository.addUser(recentDeletedUser);
    }


    private void printUserList() {
        System.out.println(userRepository.findAll());
    }


}


