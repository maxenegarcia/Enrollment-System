package repositories;

import models.Course;
import java.util.List;

public interface CourseRepository {

    Course findById(String id);

    void save(Course course);

    List<Course> findAll();
}