package com.jacoco.demotest.service;

import com.jacoco.demotest.bean.User;

import java.util.List;

public interface UserService {
    /**
     * 新增用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    boolean updateUser(User user);


    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteUser(int id);

    /**
     * 根据名字查询用户信息
     * @param userName
     */
    User findUserByName(String userName);


    /**
     * 查询所有数据
     * @return
     */
    List<User> findAll();
}
