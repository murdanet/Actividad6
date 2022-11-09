package com.example.actividad6.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.persistence.Id;
@Entity
public class CourseMaterial {
    @JsonIgnore
    @ManyToOne
    private Course course;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String url;


    public CourseMaterial() {

    }

    public CourseMaterial(String url){
        super();
        this.url = url;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {
        return "CourseMaterial{" +
                "Id=" + Id +
                ", url='" + url + '\'' +
                '}';
    }
}
