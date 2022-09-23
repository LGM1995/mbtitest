package com.example.testmbti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity // DB가 해당 객체를 인식하여 클래스로 테이블을 자동 생성 DB테이블과 직접적인 1:1 매핑
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 생성
@NoArgsConstructor // 파라미터가 없는 기본 생성자 생성
@Getter // Getter 자동 생성
@Builder // Setter를 사용하지 않고 Builder와 Constructor를 사용하여 객체의 안전성과 일관성 보장
public class Result {
    @Id // pk 컬럼
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB에서 컬럼 추가시 자동 생성
    private Long id;

    @Column
    private String name;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private Long count;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "type_id")
    private Type type;

    public void countUp() {
        this.count = this.getCount() + 1;
    }
}
