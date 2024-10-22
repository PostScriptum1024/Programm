package ru.mishin.MySpringBoot2Dbase.enity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ACADEMICDISCIPLINES")


public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "lesson")
    private String lesson;

    @Column(name = "time")
    private Integer time;

    @Column(name = "teacher")
    private String teacher;
}
