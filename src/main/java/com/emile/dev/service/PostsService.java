package com.emile.dev.service;

import com.emile.dev.domain.posts.Posts;
import com.emile.dev.domain.posts.PostsRepository;
import com.emile.dev.web.dto.PostsListResponseDto;
import com.emile.dev.web.dto.PostsResponseDto;
import com.emile.dev.web.dto.PostsSaveRequestDto;
import com.emile.dev.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {
  // 생성자로 Bean 객체를 주입 받는다.
  // final로 선언된 모든 필드를 인자값으로 하는 생성자를 RequiredArg..가 대신 생성
  private final PostsRepository postsRepository;

  @Transactional
  public Long save(PostsSaveRequestDto requestDto) {
    return postsRepository.save(requestDto.toEntity()).getId();
  }

  @Transactional
  public Long update(Long id, PostsUpdateRequestDto requestDto) {
    Posts posts = postsRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

    posts.update(requestDto.getTitle(), requestDto.getContent());

    return id;
  }

  public PostsResponseDto findById(Long id) {
    Posts entity = postsRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

    return new PostsResponseDto(entity);
  }

  @Transactional
  public void delete (Long id) {
    Posts posts = postsRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

    postsRepository.delete(posts);
  }

  @Transactional(readOnly = true)
  public List<PostsListResponseDto> findAllDesc() {
    return postsRepository.findAllDesc().stream()
            .map(PostsListResponseDto::new)
            .collect(Collectors.toList());
  }
}
