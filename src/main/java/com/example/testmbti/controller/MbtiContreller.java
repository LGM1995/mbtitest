package com.example.testmbti.controller;

import com.example.testmbti.dto.QuestionDto;
import com.example.testmbti.service.AnswerService;
import com.example.testmbti.service.QuestionService;
import com.example.testmbti.service.ResultService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MbtiController {

    @Autowired
    private AnswerService answerService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private ResultService resultService;

    @GetMapping("/templates/mbti")
    public String mbti(Model model) {
        List<QuestionDto> qDto = questionService.read();

        model.addAttribute("questions", qDto);
        return "templates/mbti/mbti";
    }
}