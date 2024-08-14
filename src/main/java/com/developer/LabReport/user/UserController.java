package com.developer.LabReport.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class UserController {

    private UserService service;

    public UserController(@Qualifier("db") UserService service)
    {
        this.service = service;
    }

    @PostMapping
    public User save(@RequestBody User user)
    {
        return service.save(user);
    }

    @GetMapping("/{userId}")
    public User findByUserId(@PathVariable("userId") Long userId){
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

    @DeleteMapping("/{userid}")
    public void delete(@PathVariable("userid") Long userid){
        service.delete(userid);
    }

}
