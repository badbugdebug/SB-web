package com.emile.dev.web.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor  // 모든 final 필드가 포함된 생성자 생성
public class HelloReponseDto {
    private final String name;
    private final int amount;
}
