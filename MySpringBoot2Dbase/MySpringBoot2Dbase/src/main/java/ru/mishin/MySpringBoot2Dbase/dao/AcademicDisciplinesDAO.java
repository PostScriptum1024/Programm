package ru.mishin.MySpringBoot2Dbase.dao;

import org.springframework.stereotype.Repository;
import ru.mishin.MySpringBoot2Dbase.enity.Discipline;
import java.util.List;

@Repository
public interface AcademicDisciplinesDAO {
    List<Discipline> getAllDisciplines();
    Discipline saveDiscipline(Discipline discipline);
    Discipline getDiscipline(int id);
    void deleteDiscipline(int id);
}
