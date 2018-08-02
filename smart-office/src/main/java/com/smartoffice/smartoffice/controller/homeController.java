package com.smartoffice.smartoffice.controller;

import com.smartoffice.smartoffice.models.User;
import com.smartoffice.smartoffice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @Autowired
    UserRepository userRepository;
    @GetMapping(value = "/")
    public String showHome(){
        User user=new User();
        user.setId(1);
        user.setUserName("asad");
        user.setPassword("asad");
        user.setEmail("something@gmail.com");
        user.setPhone("88738945");
        user.setDept("ict");
        user.setPost("student");
        user.setPhoto(null);
        user.setFiles(null);
        userRepository.save(user);
        return "index";
    }
}
