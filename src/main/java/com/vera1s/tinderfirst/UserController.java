package com.vera1s.tinderfirst;


import com.vera1s.tinderfirst.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;


    public UserController(@Autowired @Qualifier(value = "shortestNameUserService") UserService userService) {

        this.userService = userService;
    }


    @GetMapping(value = "/show-new-user")
    public User showNewUser() {
        return userService.getNewUser();
    }

    @GetMapping(value = "/show-all-users")
public List<User> showAllUsers (){
        return userService.findAll();
    }
}
