package ru.practicum.my_blog_spring_boot.repository;

import ru.practicum.my_blog_spring_boot.model.Comment;
import java.util.List;

public interface CommentRepository {
    List<Comment> findAllByPostId(Long postId);
    void save(Long postId, String text);
    Comment update(Comment comment);
    void deleteById(Long commentId);
}
