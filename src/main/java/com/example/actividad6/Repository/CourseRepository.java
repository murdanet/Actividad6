package com.example.actividad6.Repository;

import com.example.actividad6.entities.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,Long>{
public List<Course> findAll();
}
