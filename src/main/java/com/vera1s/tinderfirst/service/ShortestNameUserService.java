package com.vera1s.tinderfirst.service;

import com.vera1s.tinderfirst.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShortestNameUserService implements UserService {

    @Override
    public List<User> getNewUser() {
        List<User> users = new ArrayList<>();
        User fistUser = new User(1L, "Petr", 100, "Just only Petr");
        User secondUser = new User(2L, "Maria", 150, "Like cat");
        User thirdUser = new User(3L, "Pavel", 200, "Hat cat");

        users.add(fistUser);
        users.add(secondUser);
        users.add(thirdUser);
        return null;
    }

    @Override
    public User recommendUser() {
        List<User> users = getNewUser();

        if (users == null || users.isEmpty()) {
            return null;
        }

        User recommendedUser = users.get(0);

        for (User user : users) {
            if (user.getName().length() < recommendedUser.getName().length()) {
                recommendedUser = user;
            }
        }

        return recommendedUser;
    }

    @Override
    public User getNewUser() {
        return null;
    }
}
