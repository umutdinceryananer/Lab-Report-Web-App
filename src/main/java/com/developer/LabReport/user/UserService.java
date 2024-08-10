package com.developer.LabReport.user;
import java.util.List;

public interface UserService {

    User save(User u);

    List<User> findAllUsers();

    User findByUserId(int userid);

    User update(User u);

    void delete(int userid);
}
