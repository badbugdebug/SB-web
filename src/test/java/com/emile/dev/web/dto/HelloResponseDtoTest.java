package com.emile.dev.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

  @Test
  public void lombok_test() {
    String name = "Test";
    int amount = 1000;

    HelloReponseDto dto = new HelloReponseDto(name, amount);

    // 테스트 검증
    assertThat(dto.getName()).isEqualTo(name);
    assertThat(dto.getAmount()).isEqualTo(amount);
  }
}
