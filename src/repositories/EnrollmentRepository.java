package repositories;

import models.Enrollment;
import java.util.*;

public interface EnrollmentRepository {

    void save(Enrollment enrollment);

    List<Enrollment> findAll();
}