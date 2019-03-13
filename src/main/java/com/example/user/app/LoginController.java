package com.example.user.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ykonno.
 * @since 2019/03/13.
 */
@Controller
public class LoginController {

    @GetMapping("login")
    public String login(){
        return "login";
    }

}
