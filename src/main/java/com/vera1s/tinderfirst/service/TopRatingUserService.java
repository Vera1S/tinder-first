package com.vera1s.tinderfirst.service;

import com.vera1s.tinderfirst.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopRatingUserService implements UserService {
    @Override
    public User getNewUser() {

        List<User> allUsers = new ArrayList<>();
        User fistUser = new User(1L, "Petr", 100, "Just only Petr");
        User secondUser = new User(2L, "Maria", 150, "Like cat");
        User thirdUser = new User(3L, "Pavel", 200, "Hat cat");
        allUsers.add(fistUser);

        int maxRating = 0;
       User bestUser = null;

               for (User user : users) {
            int rating = user.getRating();

            if (rating > maxRating) {
                maxRating = rating;
                bestUser = user;
            }
        }

        return bestUser;

                }
    }

