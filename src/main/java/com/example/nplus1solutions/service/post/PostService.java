package com.example.nplus1solutions.service.post;

import com.example.nplus1solutions.converter.PostConverter;
import com.example.nplus1solutions.domain.Post;
import com.example.nplus1solutions.model.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostConverter postConverter;
    private final PostRepository postRepository;

    public List<PostDto> findAll() {
        final List<Post> posts = postRepository.findAll();
        return posts.stream().map(postConverter::convert).collect(Collectors.toList());
    }
}
