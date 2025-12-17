package com.example.demo.controller;
import  org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.*;
import com.example.demo.service.*;

@RestController
public class studentController{
    @Autowired

    @GetMapping("/getAllStudent")
public List<studentEntity>getAll(){
    return service.getAll();


}
@P
}