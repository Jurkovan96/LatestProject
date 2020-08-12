package com.example.demo.Repository;

import com.example.demo.Models.Comments;
import com.example.demo.Models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Comment;
import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comments, Long> {

   public List<Comments> getAllByUser(User user);

}
