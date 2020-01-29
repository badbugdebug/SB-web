package com.emile.dev.web.dto;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class HelloResponseDtoTest {

  @Test
  public void 롬복_테스트() {
    String name = "Test";
    int amount = 1000;

    HelloReponseDto dto = new HelloReponseDto(name, amount);

    // 테스트 검증
    assertThat(dto.getName()).isEqualTo(name);
    assertThat(dto.getAmount()).isEqualTo(amount);
  }
}
