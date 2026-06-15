package strategies;

import models.Course;
import models.Student;

import java.util.*;

public interface EnrollmentValidationStrategy {

    void validate(Student student,
                  List<Course> courses);
}