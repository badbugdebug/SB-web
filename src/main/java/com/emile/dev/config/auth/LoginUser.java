package com.emile.dev.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)  // 생성 위치, 파라미터
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
}
