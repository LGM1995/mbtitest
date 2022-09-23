package com.example.testmbti.controller;

import com.example.testmbti.entity.Answer;
import com.example.testmbti.entity.Question;
import com.example.testmbti.repository.AnswerRepository;
import com.example.testmbti.repository.QuestionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @GetMapping()
    public String index() {
        // 전체 질문 조회
        List<Question> questionList = questionRepository.findAll();
        // 전체 답변 조회
        List<Answer> answerList = answerRepository.findAll();

        return "index";
    }
}
