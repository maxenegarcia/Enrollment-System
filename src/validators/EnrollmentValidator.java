package validators;

import models.Course;
import models.Student;
import strategies.EnrollmentValidationStrategy;

import java.util.List;

public class EnrollmentValidator {

    private List<EnrollmentValidationStrategy> validations;

    public EnrollmentValidator(
            List<EnrollmentValidationStrategy> validations) {

        this.validations = validations;
    }

    public void validate(Student student,
                         List<Course> courses) {

        for (EnrollmentValidationStrategy validation : validations) {
            validation.validate(student, courses);
        }
    }
}