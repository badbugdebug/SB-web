package com.emile.dev.domain.posts;


import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest   // 설정 없이 사용할시 default H2 사용
public class PostRepositoryTest {

  @Autowired
  PostsRepository postsRepository;

  @After
  public void cleanup() {
    postsRepository.deleteAll();
  }

  @Test
  public void readContent() {
    String title = "테스트게시글";
    String content = "테스트 본문";

    postsRepository.save(Posts.builder()
            .title(title)
            .content(content)
            .author("jmpark@gmail.com")
            .build()
    );
  }
}
