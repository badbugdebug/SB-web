package com.emile.dev.web;

import com.emile.dev.web.dto.HelloReponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }

  @GetMapping("/hello/dto")
  public HelloReponseDto helloDta(@RequestParam("name") String name,
                                  @RequestParam("amount") int amount) {
    return new HelloReponseDto(name, amount);
  }
}
