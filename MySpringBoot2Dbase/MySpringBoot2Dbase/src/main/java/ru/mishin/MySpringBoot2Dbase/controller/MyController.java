package ru.mishin.MySpringBoot2Dbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.mishin.MySpringBoot2Dbase.enity.Discipline;
import ru.mishin.MySpringBoot2Dbase.enity.Student;
import ru.mishin.MySpringBoot2Dbase.service.AcademicDisciplinesService;
import ru.mishin.MySpringBoot2Dbase.service.StudentService;

import java.util.List;


@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private AcademicDisciplinesService academicDisciplinesService;

    @GetMapping("/students")
    public List<Student> allStudents(){
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
    }


    @GetMapping("/disciplines")
    public ResponseEntity<List> allDisciplines() {
        List<Discipline> allDisciplines = academicDisciplinesService.getAllDisciplines();
        if (allDisciplines.isEmpty())
            return new ResponseEntity<>(allDisciplines, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(allDisciplines, HttpStatus.FOUND);
    }

    @GetMapping("/disciplines/{id}")
    public ResponseEntity<Discipline> getDisciplines(@PathVariable("id") int id) {
        Discipline discipline = academicDisciplinesService.getDiscipline(id);
        if (discipline == null)
            return new ResponseEntity<>(discipline, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(discipline, HttpStatus.FOUND);
    }

    @PostMapping("/disciplines")
    public ResponseEntity<Discipline> saveDisciplines(@RequestBody Discipline discipline) {
        Discipline returnedDiscipline = academicDisciplinesService.saveDiscipline(discipline);
        if (returnedDiscipline == null)
            return new ResponseEntity<>(returnedDiscipline, HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(returnedDiscipline, HttpStatus.OK);
    }

    @PutMapping("/disciplines")
    public ResponseEntity<Discipline> updateDisciplines(@RequestBody Discipline discipline) {
        Discipline updatedDiscipline = academicDisciplinesService.saveDiscipline(discipline);
        if (updatedDiscipline == null)
            return new ResponseEntity<>(updatedDiscipline, HttpStatus.CONFLICT);
        return new ResponseEntity<>(updatedDiscipline, HttpStatus.OK);
    }

    @DeleteMapping("/disciplines/{id}")
    public void deleteDisciplines(@PathVariable("id") int id) {
        academicDisciplinesService.deleteDiscipline(id);
    }
}
