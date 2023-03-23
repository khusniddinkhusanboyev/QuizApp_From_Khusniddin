package com.devrezaur.main.controller;

import com.devrezaur.main.model.Admin;
import com.devrezaur.main.service.impl.AdminValidationServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/login/admin_valid")
public class AdminValidationController {

    @Autowired
    private AdminValidationServiceImple adminValidationServiceImple;
    @GetMapping
    public String newAdmin(Model model){
        model.addAttribute("newAdmin",new Admin());
        return "admin/validation/signup";
    }

    @PostMapping("/newAdmin")
    public String saveAdmin(@ModelAttribute("newAdmin") Admin admin , RedirectAttributes warning){
        if (admin.getPassword().equals("") || admin.getEmail().equals("") || admin.getUsername().equals("")) {
            warning.addFlashAttribute("warning", "something went wrong!!!");
            return "redirect:/login/admin_valid";
        }
        adminValidationServiceImple.save(admin);
        return "redirect:/login/admin_valid/admin/";
    }
}
