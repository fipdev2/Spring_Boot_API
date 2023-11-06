package atividade1.app.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import atividade1.app.models.Course;
import atividade1.app.repositories.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    public List<Course> findAll() {
        List<Course> courses = repository.findAll();
        return courses;
    }

    public Course findById(Integer id) {
        Course course = repository.findById(id).get();
        return course;
    }

    public String createCourse(Course course) {
        repository.save(course);
        return "Course has been created successfully";
    }

    public String updateCourse(Integer id, Course course) {
        Course response = findById(id);

        course.setName(response.getName());
        course.setDurationInMonths(response.getDurationInMonths());
        repository.save(course);

        return "Course has been updated successfully";
    }

    public String deleteCourse(Integer id) {
        repository.deleteById(id);
        return "Course has been deleted successfully";
    }
}
