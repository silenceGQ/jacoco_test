package com.jacoco.demotest.serviceimpl;

import com.jacoco.demotest.bean.User;
import com.jacoco.demotest.dao.UserDao;
import com.jacoco.demotest.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        userDao.addUser(user);
        return true;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }

    @Override
    public User findUserByName(String userName) {
        return userDao.findByName(userName);
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
