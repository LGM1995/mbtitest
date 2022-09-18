package com.example.testmbti.repository;

import com.example.testmbti.entity.Answer;
import com.example.testmbti.entity.Result;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    // 질문id로 답변 조회
    @Query(value =
        "SELECT * " +
            "FROM answer " +
            "WHERE question_id = :questionId",
        nativeQuery = true)
    List<Answer> findByQuestionId(@Param("questionId") Integer questionId);

}
