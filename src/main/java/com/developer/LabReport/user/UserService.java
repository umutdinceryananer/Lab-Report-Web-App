package com.developer.LabReport.user;
import java.util.List;

public interface UserService {

    User save(User u);

    List<User> findAllUsers();

    User findByUserId(Long userid);

    User update(User u);

    void delete(Long userid);
}
