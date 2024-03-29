package com.devrezaur.main.controller;

import com.devrezaur.main.dto.QuestionDTO;
import com.devrezaur.main.model.Question;
import com.devrezaur.main.service.impl.AdminServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login/admin_valid/admin")
public class AdminController {
    private final AdminServiceImpl adminService;
    public AdminController(AdminServiceImpl adminService) {
        this.adminService = adminService;
    }


    @GetMapping("/")
    public String addQuestion(Model model){
        model.addAttribute("new_ques" , new QuestionDTO());
        return "addquiz";
    }

    @PostMapping("/questions")
    public String save(@ModelAttribute("new_ques") QuestionDTO questionDTO ){
        adminService.save(new Question(
                questionDTO.getTitle(),
                questionDTO.getOptionA(),
                questionDTO.getOptionB(),
                questionDTO.getOptionC(),
                questionDTO.getOptionD(),
                questionDTO.getAns(),
                questionDTO.getChose()));
        System.out.println(new Question(
                questionDTO.getTitle() ,
                questionDTO.getOptionA(),
                questionDTO.getOptionB(),
                questionDTO.getOptionC(),
                questionDTO.getOptionD(),
                questionDTO.getAns(),
                questionDTO.getChose()));
        return "redirect:/login/admin_valid/admin/listOfQuestion";
    }

    @GetMapping("/listOfQuestion")
    public String list(Model model){

        Integer i=1;
            model.addAttribute("count" , i);

        model.addAttribute("questions" , adminService.list());
        return "admin/listOfQuestion";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        adminService.delete(id);
        return "redirect:/login/admin_valid/admin/listOfQuestion";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model){
        model.addAttribute("updateques" , adminService.findById(id));
        return "admin/update_ques";
    }

    @PutMapping("/edit")
    public String updateQues(@ModelAttribute("updateques") QuestionDTO questionDTO){
        System.err.println(adminService.save(new Question(
                questionDTO.getQuesId(),
                questionDTO.getTitle() ,
                questionDTO.getOptionA(),
                questionDTO.getOptionB(),
                questionDTO.getOptionC(),
                questionDTO.getOptionD(),
                questionDTO.getAns())));
        adminService.save(adminService.save(new Question(
                questionDTO.getQuesId(),
                questionDTO.getTitle() ,
                questionDTO.getOptionA(),
                questionDTO.getOptionB(),
                questionDTO.getOptionC(),
                questionDTO.getOptionD(),
                questionDTO.getAns())));
        return "redirect:/login/admin_valid/admin/listOfQuestion";
    }


}
