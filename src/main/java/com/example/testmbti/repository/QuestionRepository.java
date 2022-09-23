package com.example.testmbti.repository;

import com.example.testmbti.entity.Question;
import java.util.ArrayList;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuestionRepository extends JpaRepository<Question,Long> {

    // 전체 질문 리스트 가져오기
    // 리스트엔 join된 answer도 같이 들어있다.
    @Override
    @EntityGraph(attributePaths = {"answer"})
    List<Question> findAll();

}
