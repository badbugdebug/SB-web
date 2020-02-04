package com.emile.dev.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass   // 상속 받을 경우 필드 컬럼 인식
@EntityListeners(AuditingEntityListener.class)  // Auditing 기능 포함
public abstract class BaseTimeEntity {

  @CreatedDate  // 생성 시간
  private LocalDateTime createdDate;

  @LastModifiedDate  // 변경 시간
  private LocalDateTime modifiedDate;

}