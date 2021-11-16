package com.example.nplus1solutions.converter;

import com.example.nplus1solutions.domain.Comment;
import com.example.nplus1solutions.model.CommentDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CommentConverter {

    public CommentDto convert(Comment comment) {
        return CommentDto.builder()
                .id(comment.getId())
                .message(comment.getMessage())
                .postId(comment.getPostId())
                .userId(comment.getPost().getUserId())
                .build();
    }

    public List<CommentDto> convertAsList(List<Comment> comments) {
        return comments.stream().map(this::convert).collect(Collectors.toList());
    }
}
