package atividade1.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import atividade1.app.models.Course;

@Repository 
public interface CourseRepository extends JpaRepository<Course, Integer>{
    
}
