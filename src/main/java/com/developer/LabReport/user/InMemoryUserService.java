package com.developer.LabReport.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("im")
public class InMemoryUserService implements UserService {

    private final InMemoryUserDao userDao;

    public InMemoryUserService(InMemoryUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User save(User u) {
        return this.userDao.save(u);
    }

    @Override
    public List<User> findAllUsers() {
        return this.userDao.findAllUsers();
    }

    @Override
    public User findByUserId(Long userid) {
        return this.userDao.findByUserId(userid);
    }

    @Override
    public User update(User u) {
        return this.userDao.update(u);
    }

    @Override
    public void delete(Long userid) {
        userDao.delete(userid);
    }
}
