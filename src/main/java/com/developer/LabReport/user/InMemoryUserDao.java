package com.developer.LabReport.user;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

@Repository
public class InMemoryUserDao {

    private final List<User> USERS = new ArrayList<>();

    public User save(User u) {
        USERS.add(u);
        return u;
    }

    public List<User> findAllUsers() {
        return USERS;
    }

    public User findByUserId(Long userid) {
        return USERS.stream()
                .filter(u -> Objects.equals(u.getUserid(), userid))
                .findFirst()
                .orElse(null);
    }

    public User update(User u) {
        var userIndex = IntStream.range(0, USERS.size())
                .filter(index -> Objects.equals(USERS.get(index).getUserid(), u.getUserid()))
                .findFirst()
                .orElse(-1);
        if (userIndex > -1) {
            USERS.set(userIndex, u);
            return u;
        }
        return null;
    }

    public void delete(Long userid) {
        var user = findByUserId(userid);
        if (user != null) {
            USERS.remove(user);
        }
    }

}
