package com.example.user.app;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ykonno.
 * @since 2019/03/13.
 */
@Controller
public class HomeController {

    @GetMapping("hello")
    public String hello(@AuthenticationPrincipal UserDetails user, Model model){
        model.addAttribute("user", user.getUsername());
        System.out.println("usernmae : " + user.getUsername());
        return "hello";
    }
}
