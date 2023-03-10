package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.UserEntity;
import web.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/list")
    public String listUser(Model model) {
        List<UserEntity> allUser = userService.getAllUser();
        model.addAttribute("allUser", allUser);
        return "list-user";
    }
}
