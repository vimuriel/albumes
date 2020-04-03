package com.albumes.albumes.controllers;

import org.springframework.stereotype.Controller;

import com.albumes.albumes.repository.UsersRepository;
import com.moebiusgames.light.ws.GetMapping;
import org.springframework.ui.Model;


@Controller
public class UserController {

      private final UsersRepository userRepo;

      public UserController(final UsersRepository userRepo) {
            this.userRepo = userRepo;
      }

      @GetMapping("/")
      public String index(final Model userModel) {
            userModel.addAttribute("userList",userRepo.findAll());
            System.out.println(userModel.toString()); 
            return "index";
      }
}