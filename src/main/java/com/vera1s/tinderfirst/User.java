package com.vera1s.tinderfirst;


//POJO - plain old java object - старый добрый джава объект

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //getter + setter + required args + to string + equals
@AllArgsConstructor //конструктор со всеми полями
@NoArgsConstructor
public class User {

    private Long id;

    private String name;

    private int rating;

    private String description;

}
