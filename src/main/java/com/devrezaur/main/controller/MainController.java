package com.devrezaur.main.controller;

import java.util.List;

import com.devrezaur.main.model.UnCorrectAnswer;
import com.devrezaur.main.service.UnCorrectAnswerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.devrezaur.main.model.QuestionForm;
import com.devrezaur.main.model.Result;
import com.devrezaur.main.service.QuizService;

@Controller
public class MainController {
    @Autowired
   private QuizService qService;
   @Autowired
   private Result result;
    @Autowired
   private UnCorrectAnswerService unCorrectAnswerService;


    @GetMapping("/")
    public String home() {
        return "index.html";
    }


    @PostMapping("/quiz")
    public String quiz(@RequestParam String username, Model m, RedirectAttributes ra) {
        if (username.equals("")) {
            ra.addFlashAttribute("warning", "You must enter your name");
            return "redirect:/";
        }

        QuestionForm qForm = qService.getQuestions();

        m.addAttribute("qForm", qForm);

        return "quiz.html";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute QuestionForm qForm, Model m) {

        result.setUsername(qForm.getUser());

        result.setTotalCorrect(qService.getResult(qForm).getCorrectAnswersCount());

        var model = qService.getResult(qForm).getUnCorrectAnswerList();

        var id = qService.saveScore(result);

        model.forEach(a -> a.setResultId(id));

        unCorrectAnswerService.saveAll(model);

        m.addAttribute("result", result);

        return "result.html";
    }

    @GetMapping("/user/{id}")
    public String unCorrectAnswer(@PathVariable("id") Integer id, Model m) {

        List<UnCorrectAnswer> list = unCorrectAnswerService.getUnCorrectAnswers(id);

        m.addAttribute("sList", list);
        return "uncorrect.html";
    }

    @GetMapping("/score")
    public String score(Model m) {
        List<Result> sList = qService.getTopScore();
        m.addAttribute("sList", sList);

        return "scoreboard.html";
    }

}
