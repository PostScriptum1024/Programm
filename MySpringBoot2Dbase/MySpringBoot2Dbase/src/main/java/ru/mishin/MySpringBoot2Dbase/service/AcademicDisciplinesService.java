package ru.mishin.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Service;
import ru.mishin.MySpringBoot2Dbase.enity.Discipline;
import java.util.List;


@Service
public interface AcademicDisciplinesService {

    List<Discipline> getAllDisciplines();
    Discipline saveDiscipline(Discipline discipline);
    Discipline getDiscipline(int id);
    void deleteDiscipline(int id);
}