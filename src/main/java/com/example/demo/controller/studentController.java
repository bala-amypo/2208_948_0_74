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
@PostMapping("/add")
public studentEntity addStudent(@Valid @RequestBody studentEntity student)
{
    return service.addStudent(student);
}
@GetMapping("/get/{id}")
public studentEntity getbyId(@pathvariable long id)
{
    return service.getbyId(id);
}
@PutMapping("/update/{id}")
public studentEntity updateById(id,newstu);
}
