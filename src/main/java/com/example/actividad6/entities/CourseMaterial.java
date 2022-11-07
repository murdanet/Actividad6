package com.example.actividad6.entities;


import javax.persistence.OneToOne;

public class CourseMaterial {
    @OneToOne
    private Course course;
}
