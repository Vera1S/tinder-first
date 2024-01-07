package com.vera1s.tinderfirst.service;

import com.vera1s.tinderfirst.User;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@Primary
@RequiredArgsConstructor
public class ShortestNameUserService implements UserService {

    public List<User> initUsers(){
        List<User> users = new ArrayList<>();
        User fistUser = new User(1L, "Petr", 100, "Just only Petr");
        User secondUser = new User(2L, "Maria", 150, "Like cat");
        User thirdUser = new User(3L, "Pavel", 200, "Hat cat");

        users.add(fistUser);
        users.add(secondUser);
        users.add(thirdUser);

        return users;
    }

    @Override
    public User getNewUser() {
        List<User> users = initUsers();

        if (users == null || users.isEmpty()) {
            return null;
        }

        User shortNameUser = users.get(0);

        for (User user : users) {
            if (user.getName().length() < shortNameUser.getName().length()) {
                shortNameUser = user;
            }
        }

        return shortNameUser;
    }


    public List<User> findAll() {
        return initUsers();
    }





}
