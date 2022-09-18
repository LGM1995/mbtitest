package com.example.testmbti.dto;

import com.example.testmbti.entity.Question;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 생성
@Getter // getter 자동 생성
/* DTO를 생성하는 이유
 * Entity 를 사용하여 DB와 직접적인 연결을 피하기 위함
 * Controller <-> Service 사이에 DTO로 정보를 전달
 * Service <-> JpaRepository 사이에 DB에 직접적인 연결이 필요할 때
 * Service가 DTO를 Entity로 변환하여 JpaRepositrory로 CRUD 진행
 */
public class QuestionDto {
    private Integer id;
    private String content;

    /* questionDto를 Entity로 변환 */
    public Question toEntity() {
        return new Question(id, content);
    }
}
