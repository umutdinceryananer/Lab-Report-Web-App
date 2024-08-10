package com.developer.LabReport.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> findAllUsers() {
        return List.of(
                new User(
                        "Umut",
                        "Yananer",
                        1234567,
                        true),
                new User(
                        "Eren",
                        "Bozkurt",
                        1212121,
                        false
                )
        );
    }
}
