package com.itguide.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ajantha on 5/4/17.
 */

@RestController
public class UserController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/users")
    public List<String> getUsers() {
        List<String> userList = new ArrayList<>();

        userList.add("Ajantha");
        userList.add("Pushpa");
        userList.add("Kumara");
        userList.add("Bandara");
        userList.add("Chanaka");

        return userList;
    }
}
