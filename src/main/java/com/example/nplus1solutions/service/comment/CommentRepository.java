package com.example.nplus1solutions.service.comment;


import com.example.nplus1solutions.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

}
