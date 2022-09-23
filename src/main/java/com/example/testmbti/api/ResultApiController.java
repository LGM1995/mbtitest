package com.example.testmbti.api;

import com.example.testmbti.entity.Mbti;
import com.example.testmbti.entity.Result;
import com.example.testmbti.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultApiController {
    @Autowired
    private ResultService resultService;

    // 결과 리턴
    @PostMapping("/api/{mbti}")
    public ResponseEntity<Result> count(@PathVariable Mbti mbti) {
        Result result = resultService.showAndUpdate(mbti);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
