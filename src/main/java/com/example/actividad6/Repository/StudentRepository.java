package com.example.actividad6.Repository;

import com.example.actividad6.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository <Student,Long> {
}
