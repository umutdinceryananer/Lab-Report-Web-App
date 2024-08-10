package com.developer.LabReport.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public User save(@RequestBody User user)
    {
        return service.save(user);
    }

    @GetMapping("/{userId}")
    public User findByUserId(@PathVariable("userId") int userId){
        return service.findByUserId(userId);
    }

    @GetMapping
    public List<User> findAllUsers() {
            return service.findAllUsers();
    }

    @PutMapping
    public User updateUser(@RequestBody User user)
    {
        return service.update(user);
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable("userId") int userId){
        service.delete(userId);
    }

}
