package com.devrezaur.main.controller;

import com.devrezaur.main.model.Admin;
import com.devrezaur.main.model.User;
import com.devrezaur.main.service.impl.AdminValidationServiceImple;
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
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private SignUpServiceImpl signUpService;

    @Autowired
    private AdminValidationServiceImple adminValidationServiceImple;
    @GetMapping
    public String validation(Model model){
        model.addAttribute("validation" , new User());
        return "user/login/login";
    }
    @PostMapping("/valid")
    public String check(@ModelAttribute("validation") User user , RedirectAttributes ra ){
        for (User user1 : signUpService.findAll()){
            if (user.getName().equals(user1.getName()) && user.getPassword().equals(user1.getPassword())){
                return "index";
            }
        }
        ra.addFlashAttribute("warning", "password or username is wrong...");
        return "redirect:/login";
    }

    @GetMapping("/admin_valid/check")
    public String validateAdmin(Model model){
        model.addAttribute("admin" , new Admin());
        return "/admin/validation/login";
    }
    @PostMapping("/admin_valid/checked")
    public String check(@ModelAttribute("admin") Admin admin , RedirectAttributes ra ){
        for (Admin admin1 : adminValidationServiceImple.findAll()){
            if (admin.getUsername().equals(admin1.getUsername()) && admin.getPassword().equals(admin1.getPassword())){
                return "redirect:/login/admin_valid/admin/";
            }
        }
        ra.addFlashAttribute("warning", "password or username is wrong...");
        return "redirect:/login/admin_valid/check";
    }
}
