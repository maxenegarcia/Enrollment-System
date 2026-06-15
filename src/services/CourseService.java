package services;

import models.Course;
import repositories.CourseRepository;

import java.util.*;

public class CourseService {

    private CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public void addCourse(Course course) {
        repository.save(course);
    }

    public Course getCourseById(String id) {
        return repository.findById(id);
    }

    public List<Course> getAllCourses() {
        return repository.findAll();
    }
}