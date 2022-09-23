package com.example.testmbti.service;

import com.example.testmbti.entity.Answer;
import com.example.testmbti.entity.Question;
import com.example.testmbti.repository.AnswerRepository;
import com.example.testmbti.repository.QuestionRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 서비스 객체를 스트링 부트에 생성
@Slf4j // log 사용을 위함
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    // questionId에 해당하는 두개의 answer를 반환
    public List<Answer> answerList(Long questionId) {
        return answerRepository.findByQuestionId(questionId);
    }
}
