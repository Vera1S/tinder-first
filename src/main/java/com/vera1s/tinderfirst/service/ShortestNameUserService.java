package com.vera1s.tinderfirst.service;

import com.vera1s.tinderfirst.User;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class ShortestNameUserService implements UserService {

    public final UserService userService;


    @Override
    public List<User> getNewUser() {
        List<User> users = userService.findAll();
        userService.getNewUser();
        return users;
    }

    public User getRatingUsers() {
        List<User> users = getNewUser();

        if (users == null || users.isEmpty()) {
            return null;
        }

        User getRatingUsers = users.get(0);

        for (User user : users) {
            if (user.getName().length() < getRatingUsers.getName().length()) {
                getRatingUsers = user;
            }
        }

        return getRatingUsers;
    }


}
