package com.example.nplus1solutions.controller;

import com.example.nplus1solutions.model.PostDto;
import com.example.nplus1solutions.service.post.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("posts")
public class PostController {

    private final PostService postService;

    @GetMapping
    public List<PostDto> getById() {
        return postService.findAll();
    }
}
