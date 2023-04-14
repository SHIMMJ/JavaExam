package com.simminjeong.finalprojectpro;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    private List<User> users = new ArrayList<>();


    @Override
    public void addUser(User user) {

        for (User u : users) {
            if (u.getId() == user.getId()) {
                System.out.println("동일한 id가 존재");
            }
        }
        users.add(user);

    }

    @Override
    public void updateUser(User user) {
        int index = -1;
        // 해당 유저의 id가 있는지 확인
        for (int i = 0; i < users.size(); i++) {
            User e = users.get(i);
            if (e.getId() == user.getId()) {
                index = i;
                break;
            }
        }
        // 해당 id가 있으면 바꾼다.
        if (index != -1) {
            users.set(index, user);
        }

    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
    }

    @Override
    public List<User> findAll() {
        for (User u : users) {
            System.out.println(u);
        }
         return null;
    }


    @Override
    public User findById(int id) {
        for (User u : users) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }



}
