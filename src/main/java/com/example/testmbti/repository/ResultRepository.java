package com.example.testmbti.repository;

import com.example.testmbti.entity.Result;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ResultRepository extends JpaRepository<Result, Integer> {
    // 대답으로 정해진 MBTI로의 결과 조회
    @Query(value =
        "SELECT * " +
            "FROM result " +
            "WHERE mbti_id = :mbtiId",
        nativeQuery = true)
    List<Result> findByMbtiId(@Param("mbtiId") Integer mbtiId);
}
