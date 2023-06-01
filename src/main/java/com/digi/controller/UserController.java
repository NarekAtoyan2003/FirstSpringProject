package com.digi.controller;


import com.digi.model.User;
import com.digi.model.UserDTO;
import com.digi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/get-all")
    public List<User> getAll() {
        List<User> users = userService.get();
        System.out.println("This is user list");
        return users;
    }

    @RequestMapping("/get-by")
    public List<User> getByName(@RequestParam String name){
       return userService.getByName(name);
    }

    @RequestMapping("/get-by-age")
    public List<User> getByAgeBetween(@RequestParam int minAge, @RequestParam int maxAge){
        return userService.getByAgeBetween(minAge,maxAge);
    }

    @PostMapping("/save")
    public void save(@RequestBody UserDTO dto){
       userService.save(dto);
    }

    @DeleteMapping("/delete")
    public void deleteByID(@RequestParam int id){
        userService.deleteByID(id);
    }

    /*getAll(@RequestP (value="name", required=false)String name)*/

}
