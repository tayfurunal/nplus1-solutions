package com.example.nplus1solutions.service.comment;

import com.example.nplus1solutions.converter.CommentConverter;
import com.example.nplus1solutions.domain.Comment;
import com.example.nplus1solutions.model.CommentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentConverter commentConverter;
    private final CommentRepository commentRepository;

    public List<CommentDto> findAll() {
        final List<Comment> comments = commentRepository.findAll();
        return comments.stream().map(commentConverter::convert).collect(Collectors.toList());
    }
}
