package com.itguide.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ajantha on 5/4/17.
 */

@RestController
public class UserController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
