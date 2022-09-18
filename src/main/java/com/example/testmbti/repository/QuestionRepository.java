package com.example.testmbti.repository;

import com.example.testmbti.entity.Question;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Integer> {

}
