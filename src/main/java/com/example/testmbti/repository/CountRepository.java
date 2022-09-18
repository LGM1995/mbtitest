package com.example.testmbti.repository;

import com.example.testmbti.entity.Answer;
import com.example.testmbti.entity.Count;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CountRepository extends JpaRepository<Count, Integer> {
    // 결과에 따른 카운트수 조회
    @Query(value =
        "SELECT * " +
            "FROM count " +
            "WHERE result_id = :resultId",
        nativeQuery = true)
    List<Count> findByResultId(@Param("result_id") Integer result_id);

}
