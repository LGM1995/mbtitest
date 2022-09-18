package com.example.testmbti.service;

import com.example.testmbti.dto.CountDto;
import com.example.testmbti.entity.Count;
import com.example.testmbti.entity.Result;
import com.example.testmbti.repository.CountRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountService {
    @Autowired
    private CountRepository countRepository;

    /* 모든 카운트 조회 */
    public List<Count> list() { return countRepository.findAll();}

    /* result_id로 조회 */
    public List<Count> findByResultIdList(Integer resultId) {
        return countRepository.findByResultId(resultId);
    }

}
