package com.course.workshopmongo.repository;

import com.course.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {

    @Query("{'title': { $regex:  ?0, $options: 'i' } }")
    List<Post> findByTitle(String text);

    List<Post> findByTitleContainingIgnoreCase(String text);
}
