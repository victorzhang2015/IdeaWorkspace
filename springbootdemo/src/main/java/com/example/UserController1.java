package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017-3-7.
 */
@RestController
public class UserController1 {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @GetMapping(value = "/getUsers1")
    public List<User> getUserList(){
        //userService.AddNewUser();
        return userRepository.findAll();
    }
    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
