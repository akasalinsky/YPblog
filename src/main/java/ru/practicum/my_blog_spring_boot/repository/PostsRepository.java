package ru.practicum.my_blog_spring_boot.repository;

import ru.practicum.my_blog_spring_boot.model.Post;
import java.util.List;


public interface PostsRepository {
    List<Post> findAll();
    Post save(Post post);
    void deleteById(Long id);
    void update(Post post); // ← этот метод
    Post findById(Long id);
}

