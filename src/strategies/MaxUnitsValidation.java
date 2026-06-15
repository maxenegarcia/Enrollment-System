package strategies;

import models.Course;
import models.Student;

import java.util.*;

public class MaxUnitsValidation
        implements EnrollmentValidationStrategy {

    @Override
    public void validate(Student student,
                         List<Course> courses) {

        int totalUnits = 0;

        for (Course course : courses) {
            totalUnits += course.getUnits();
        }

        if (totalUnits > 18) {
            throw new RuntimeException(
                    "Maximum allowed units exceeded."
            );
        }
    }
}