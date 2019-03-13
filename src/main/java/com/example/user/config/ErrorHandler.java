package com.example.user.config;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ykonno.
 * @since 2019/03/13.
 */
@Controller
public class ErrorHandler implements ErrorController {

    @RequestMapping("/error")
    public String error404(Model model, @AuthenticationPrincipal UserDetails user){
        model.addAttribute("user", user.getUsername());

        return "404error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
