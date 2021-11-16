package com.example.nplus1solutions.service.post;


import com.example.nplus1solutions.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
