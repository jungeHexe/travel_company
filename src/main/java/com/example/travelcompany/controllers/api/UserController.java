package com.example.travelcompany.controllers.api;

import com.example.travelcompany.db.entity.User;
import com.example.travelcompany.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(
            UserService userService
    ) {
        this.userService = userService;
    }

    @GetMapping("")
    public List<User> findUsers(){
        return userService.findAll();
    }

    @GetMapping("{id}")
    public User findUserById(@PathVariable Long id){
        return userService.findById(id).get();
    }

    @PutMapping("{id}")
    public User updateUserById(
            @PathVariable("id") Long id,
            String name,
            String surname,
            String login,
            String password,
            String email
    ){
        User user = userService.findById(id).get();
        user.setName(name)
                .setSurname(surname)
                .setEmail(email)
                .setLogin(login)
                .setPassword(password);

        return userService.save(user);
    }

    @PostMapping("")
    public User createUser(
            String name,
            String surname,
            String login,
            String password,
            String email
    ){
        User user = new User();
        user.setName(name)
                .setSurname(surname)
                .setEmail(email)
                .setLogin(login)
                .setPassword(password);

        return userService.save(user);
    }

    @DeleteMapping("{id}")
    public void deleteUserById(
            @PathVariable Long id
    ){
        userService.delete(findUserById(id));
    }
}
