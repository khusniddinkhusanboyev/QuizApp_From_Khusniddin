package com.devrezaur.main.controller;

import com.devrezaur.main.model.User;
import com.devrezaur.main.service.impl.SignUpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/signup")
public class SignUpController {
    private final SignUpServiceImpl signUpService;

    public SignUpController(SignUpServiceImpl signUpService) {
        this.signUpService = signUpService;
    }

    @GetMapping("/new_user")
    public String signUp(Model model) {
        model.addAttribute("add_user", new User());
        return "user/signup/signup.html";
    }

    @PostMapping("/user")
    public String saveUser(@ModelAttribute("add_user") User user, RedirectAttributes warning) {
        System.err.println(user);
        if (user.getPassword().equals("") || user.getEmail().equals("") || user.getName().equals("")) {
        warning.addFlashAttribute("warning", "something went wrong!!!");
        return "redirect:/signup/new_user";
        }
        signUpService.save(user);
        return "index";





    }
}
