package com.example.educationcenter.repository;

import com.example.educationcenter.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
    List<Comment> findAllByUserId(int id);
//    List<Comment> findAllByHomeWork_Id(int id);

}
