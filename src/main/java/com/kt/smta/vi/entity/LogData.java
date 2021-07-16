package com.kt.smta.vi.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class LogData extends BaseTimeEntity {
    @Id
    @GeneratedValue
    private Long id;            // PK
    private String imageUrl;    // Image URL
    @ElementCollection(fetch = FetchType.LAZY)
    private List<Integer> reqViModuleNums = new ArrayList<>();  // 요청된 모듈 번호 리스트
}
