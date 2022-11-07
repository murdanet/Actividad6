package com.example.actividad6.Repository;

import com.example.actividad6.entities.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository {
    public interface CourseRepository extends CrudRepository<Course,Long>{

    }
}
