package com.example.selfspring.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//@Date 주의해서 사용한다.
@Getter
@Setter
@RequiredArgsConstructor
public class Member {
    private Long Id;
    private final String memberName;
    private final Grade grade;
}
