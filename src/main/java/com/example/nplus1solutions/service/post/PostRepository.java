package com.example.nplus1solutions.service.post;

import com.example.nplus1solutions.domain.Post;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

interface PostRepository extends JpaRepository<Post, Integer> {

    //@EntityGraph(attributePaths = {"comments"})
    //@Query(value = "FROM Post p LEFT JOIN FETCH p.comments ")
    List<Post> findAllByOrderByUserId();
}
