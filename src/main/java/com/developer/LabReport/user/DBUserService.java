package com.developer.LabReport.user;

import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("db")
@Primary
public class DBUserService implements UserService {

    private final UserRepository repository;

    public DBUserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User save(User u) {
        return repository.save(u);
    }

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @Override
    public User findByUserId(Long userid) {
        return repository.findByUserid(userid);
    }

    @Override
    public User update(User u) {
        return repository.save(u);
    }

    @Transactional
    public void delete(Long userid) {
        repository.deleteByUserid(userid);
    }
}
