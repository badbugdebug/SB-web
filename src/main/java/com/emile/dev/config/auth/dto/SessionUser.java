package com.emile.dev.config.auth.dto;

import com.emile.dev.domain.user.User;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
public class SessionUser implements Serializable {  // Session에 넣기 위해선 직렬화 필요 직렬화는 자식들 까지 포함 되서 성능이슈 가능
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
