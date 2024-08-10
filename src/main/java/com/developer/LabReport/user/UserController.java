package com.developer.LabReport.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")

public class UserController {

    @GetMapping
    public List<String> findAllUsers() {
        return List.of(
          "Umut Yananer","Hikmet Bozkurt"
        );
    }


}
