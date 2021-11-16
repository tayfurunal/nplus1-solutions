package com.example.nplus1solutions.controller;

import com.example.nplus1solutions.model.CommentDto;
import com.example.nplus1solutions.service.comment.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("comments")
public class CommentController {

    private final CommentService commentService;

    @GetMapping
    public List<CommentDto> getById() {
        return commentService.findAll();
    }
}
