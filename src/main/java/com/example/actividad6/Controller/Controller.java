package com.example.actividad6.Controller;

import com.example.actividad6.Repository.CourseMaterialRepository;
import com.example.actividad6.Repository.CourseRepository;
import com.example.actividad6.entities.Course;
import com.example.actividad6.entities.CourseMaterial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/CourseApp")
public class Controller {
@Autowired
    private CourseRepository courseRepository;

@Autowired
private CourseMaterialRepository cmRepository;


@GetMapping("/allCourses")
public ResponseEntity<?> getCourse() {

    List<Course> course = courseRepository.findAll();
    if (course.isEmpty()) {
        return ResponseEntity.notFound().build();
    } else {
        return ResponseEntity.ok(course);
    }
}

@GetMapping("/CourseMaterial")
public List <CourseMaterial> getCourseMaterial(){
    return (List <CourseMaterial>) cmRepository.findAll();
}

    @GetMapping("/allCourses/{id}")
    public ResponseEntity<?> getCourse(@PathVariable long id) {

        Course course = courseRepository.findById(id).orElse(null);
        if (course == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(course);
        }

    }
}


