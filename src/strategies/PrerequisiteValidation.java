package strategies;

import models.Course;
import models.Student;

import java.util.List;

public class PrerequisiteValidation
        implements EnrollmentValidationStrategy {

    @Override
    public void validate(Student student,
                         List<Course> courses) {

        System.out.println(
            "Prerequisite validation passed."
        );
    }
}