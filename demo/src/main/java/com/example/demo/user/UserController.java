package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;
@GetMapping("/signup")
    public String signupForm(Model model){
    model.addAttribute("user",new User());
return "signup";
}
@PostMapping("/signup")
public String saveUser(@ModelAttribute User user){
 userRepository.save(user);
 return "signup";
}
}
