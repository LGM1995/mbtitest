package com.example.testmbti.service;

import com.example.testmbti.dto.QuestionDto;
import com.example.testmbti.entity.Question;
import com.example.testmbti.repository.QuestionRepository;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 서비스 객체를 스트링 부트에 생성
public class QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

    // 조인된 모든 question을 가져와 dto로 변환시킨다.
    @Transactional
    public List<QuestionDto> read() {
        return questionRepository.findAll().stream().map(question -> QuestionDto.toDto(question)).collect(
            Collectors.toList());
    }
}
