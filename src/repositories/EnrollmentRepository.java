package repositories;

import models.Enrollment;
import java.util.List;

public interface EnrollmentRepository {

    void save(Enrollment enrollment);

    List<Enrollment> findAll();
}