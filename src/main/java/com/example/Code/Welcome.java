package com.example.Code;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        return "❤❤❤❤❤ Welcome Indu to Daddy's world ❤❤❤❤❤";
    }
}