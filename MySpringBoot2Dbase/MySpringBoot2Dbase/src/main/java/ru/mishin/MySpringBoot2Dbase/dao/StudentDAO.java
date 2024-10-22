package ru.mishin.MySpringBoot2Dbase.dao;

import ru.mishin.MySpringBoot2Dbase.enity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
