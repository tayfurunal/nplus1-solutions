package com.example.nplus1solutions.converter;

import com.example.nplus1solutions.domain.Post;
import com.example.nplus1solutions.model.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PostConverter {

    private final CommentConverter commentConverter;

    public PostDto convert(Post post) {
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .userId(post.getUserId())
                .comments(commentConverter.convertAsList(post.getComments()))
                .build();
    }
}
