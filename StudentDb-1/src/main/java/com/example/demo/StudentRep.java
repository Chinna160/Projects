package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRep  extends CrudRepository<Student, Integer>{

List<Student> findByEmail(String email);
}
