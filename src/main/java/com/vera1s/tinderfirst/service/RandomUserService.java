package com.vera1s.tinderfirst.service;

import com.vera1s.tinderfirst.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class RandomUserService implements UserService {
    @Override
    public User getNewUser () {
        List<User> users = new ArrayList<>();
        User fistUser = new User(1L, "Petr", 100, "Just only Petr");
        User secondUser = new User(2L, "Maria", 150, "Like cat");
        User thirdUser = new User(3L, "Pavel", 200, "Hat cat");

        users.add(fistUser);
        users.add(secondUser);
        users.add(thirdUser);

        Random random = new Random();
        int randomUser = random.nextInt(3);

        return users.get(randomUser);
    }
}
