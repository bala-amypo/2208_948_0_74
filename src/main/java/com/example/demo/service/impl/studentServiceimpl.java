package com.example.demo.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.studentEntity;
import com.example.demo.repository.studentRepo;
import com.example.demo.service.studentService;

@Service
public class studentServiceImpl implements studentService {

    @Autowired
    studentRepo repo;

    @Override
    public List<studentEntity> getAll() {
        return repo.findAll();
    }
}