package atividade1.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import atividade1.app.models.Course;
import atividade1.app.services.CourseService;

@RestController
@RequestMapping(value = "/course")
public class CourseController {
    @Autowired
    private CourseService service;

    @GetMapping
    public List<Course> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Course findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public String createCourse(@RequestBody Course course) {
        return service.createCourse(course);
    }

    @PutMapping(value = "{/id}")
    public String updateCourse(@PathVariable Integer id, @RequestBody Course course) {
        return service.updateCourse(id, course);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteCourse(@PathVariable Integer id) {
        return service.deleteCourse(id);
    }
}
