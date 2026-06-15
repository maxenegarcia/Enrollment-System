package repositories.impl;

import models.Enrollment;
import repositories.EnrollmentRepository;

import java.util.*;

public class InMemoryEnrollmentRepository
        implements EnrollmentRepository {

    private List<Enrollment> enrollments = new ArrayList<>();

    @Override
    public void save(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    @Override
    public List<Enrollment> findAll() {
        return enrollments;
    }
}