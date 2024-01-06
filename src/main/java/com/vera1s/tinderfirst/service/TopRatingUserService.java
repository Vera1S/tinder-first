package com.vera1s.tinderfirst.service;

import com.vera1s.tinderfirst.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TopRatingUserService implements UserService {

    public final UserService userService;
    @Override
    public User getNewUser() {

        List<User> allUsers = new ArrayList<>();
        Optional<User> optionalAllUser = new Optional = userService.getNewUser();

        int maxRating = 0;
       User bestUser = null;

               for (User user : optionalAllUser) {
            int rating = user.getRating();

            if (rating > maxRating) {
                maxRating = rating;
                bestUser = user;
            }
        }

        return bestUser;

                }
    }

