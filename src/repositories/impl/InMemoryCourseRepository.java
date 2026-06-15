package repositories.impl;

import models.Course;
import repositories.CourseRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryCourseRepository implements CourseRepository {

    private Map<String, Course> courses = new HashMap<>();

    @Override
    public Course findById(String id) {
        return courses.get(id);
    }

    @Override
    public void save(Course course) {
        courses.put(course.getId(), course);
    }

    @Override
    public List<Course> findAll() {
        return new ArrayList<>(courses.values());
    }
}