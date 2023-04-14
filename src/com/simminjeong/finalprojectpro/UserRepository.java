package com.simminjeong.finalprojectpro;

import java.util.List;

public interface UserRepository {

    // CRUD

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    // 유저 전체 목록
    List<User> findAll();

    // 해당 id의 유저 찾기
    User findById(int id);



}
