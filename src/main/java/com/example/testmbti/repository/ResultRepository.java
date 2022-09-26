package com.example.testmbti.repository;

import com.example.testmbti.entity.Mbti;
import com.example.testmbti.entity.Question;
import com.example.testmbti.entity.Result;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ResultRepository extends JpaRepository<Result, Long> {

    // type 리스트를 포함한 모든 result
    @Override
    @EntityGraph(attributePaths = {"type"})
    List<Result> findAll();

    @Query(value =
        "SELECT * " +
            "FROM result " +
            "WHERE type_id = :typeId",
        nativeQuery = true)
    List<Result> findByTypeId(@Param("typeId") Long typeId);
}
