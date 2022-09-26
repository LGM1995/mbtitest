package com.example.testmbti.service;

import com.example.testmbti.entity.Answer;
import com.example.testmbti.entity.Mbti;
import com.example.testmbti.entity.Question;
import com.example.testmbti.entity.Result;
import com.example.testmbti.repository.QuestionRepository;
import com.example.testmbti.repository.ResultRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 서비스 객체를 스트링 부트에 생성
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

}
