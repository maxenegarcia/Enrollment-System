package services;

import models.Course;
import models.Enrollment;
import models.Student;
import repositories.EnrollmentRepository;
import validators.EnrollmentValidator;

import java.util.List;

public class EnrollmentService {

    private EnrollmentRepository enrollmentRepository;
    private EnrollmentValidator enrollmentValidator;

    public EnrollmentService(
            EnrollmentRepository enrollmentRepository,
            EnrollmentValidator enrollmentValidator) {

        this.enrollmentRepository = enrollmentRepository;
        this.enrollmentValidator = enrollmentValidator;
    }

    public void enroll(Student student,
                       List<Course> courses) {

        enrollmentValidator.validate(student, courses);

        Enrollment enrollment =
                new Enrollment(student, courses);

        enrollmentRepository.save(enrollment);
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }
}