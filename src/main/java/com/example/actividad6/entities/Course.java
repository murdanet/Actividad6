package com.example.actividad6.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.example.actividad6.entities.Student;
import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String title;

    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
  private List <CourseMaterial> courseMaterial;

@ManyToMany(mappedBy = "cursos")
@JsonIgnore
private List<Student> students;


    public Course() {

    }

    public Course(String title){
        super();
        this.title=title;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

