package com.vera1s.tinderfirst;


import com.vera1s.tinderfirst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(@Qualifier("randomUserService") UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "/show-new-user")
    public User showNewUser() {
        return userService.getNewUser();
    }

    @GetMapping(value = "/rating-users")
    public List<User> getRatingUsers() {
        return userService.getRatingUsers();
    }
}
