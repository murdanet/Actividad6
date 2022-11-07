package com.example.actividad6.entities;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Course {
@Id
    private long Id;
    private String title;

    public Course() {

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

    @Override
    public String toString() {
        return "Course{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Entity
    public class Student{
        @Id
    private long id;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private boolean wantsNewLetter;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
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

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
        }

        public boolean isWantsNewLetter() {
            return wantsNewLetter;
        }

        public void setWantsNewLetter(boolean wantsNewLetter) {
            this.wantsNewLetter = wantsNewLetter;
        }
    }
}
