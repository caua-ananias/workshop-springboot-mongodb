package com.course.workshopmongo.resources;

import com.course.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1", "Maria Brown", "maria@gmail.com");
        User Alex = new User("2", "Alex Green", "alex@gmail.com");
        List<User> list = new ArrayList<User>();

        list.addAll(Arrays.asList(maria, Alex));
        return ResponseEntity.ok().body(list);
    }

}
