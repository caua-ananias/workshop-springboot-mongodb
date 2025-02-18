package com.course.workshopmongo.services;

import com.course.workshopmongo.domain.Post;
import com.course.workshopmongo.repository.PostRepository;
import com.course.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public List<Post> findAll() {
        return repo.findAll();
    }

    public Post findById(String id) {
        Post post = repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Post not found"));
        return post;
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitle(text);
    }

}
