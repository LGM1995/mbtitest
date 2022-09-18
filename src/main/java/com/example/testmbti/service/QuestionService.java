package com.example.testmbti.service;

import com.example.testmbti.entity.Question;
import com.example.testmbti.repository.QuestionRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 서비스 객체를 스트링 부트에 생성
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    /* 모든 질문 조회 */
    public List<Question> list() {
        return questionRepository.findAll();
    }


}
