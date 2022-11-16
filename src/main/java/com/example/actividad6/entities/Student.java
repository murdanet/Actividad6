package com.example.actividad6.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
private String lastName;
private String firstName;
Date birthDate;
boolean wantsNewsLetter;

    @ManyToMany
    @JoinTable(
            name = "sc",
            joinColumns = @JoinColumn(name = "ID"),
            inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
    private List<Course> cursos;

    public List<Course> getCursos() {
        return cursos;
    }

    public void setCursos(List<Course> cursos) {
        this.cursos = cursos;
    }

    public Student () {
}

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isWantsNewsLetter() {
        return wantsNewsLetter;
    }

    public void setWantsNewsLetter(boolean wantsNewsLetter) {
        this.wantsNewsLetter = wantsNewsLetter;
    }
}
