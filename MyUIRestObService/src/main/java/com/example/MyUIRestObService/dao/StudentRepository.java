package com.example.MyUIRestObService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MyUIRestObService.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
