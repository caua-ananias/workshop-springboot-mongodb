package com.course.workshopmongo.services;

import com.course.workshopmongo.domain.User;
import com.course.workshopmongo.repository.UserRepository;
import com.course.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        User user = repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found"));
        return user;
    }



}
