package repositories;

import models.Course;
import models.Student;
import java.util.*;

public interface EnrollmentValidationRepository {

    void validate(Student student,
                  List<Course> courses);
}