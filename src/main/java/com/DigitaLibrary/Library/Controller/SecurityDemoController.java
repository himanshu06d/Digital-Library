package com.DigitaLibrary.Library.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemoController {


    @GetMapping("greet/{username}")
    public String greet(String username){
        return "Hello" + username;
    }

    @GetMapping("/admin/greet/{username}")
        public String adminGreet(String username){
            return "Hello admin" + username;
        }

}

