package com.example.testmbti.dto;

import com.example.testmbti.entity.Mbti;
import com.example.testmbti.entity.Question;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 생성
@Getter // Getter 자동 생성
public class MbtiDto {
    private Integer id;

    private String mbti;

    /* mbtiDto를 Entity로 변환 */
    public Mbti toEntity() {
        return new Mbti(id, mbti);
    }
}
