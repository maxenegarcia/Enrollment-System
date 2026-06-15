package repositories;

import models.Student;
import java.util.*;

public interface StudentRepository {

    Student findById(String id);

    void save(Student student);

    List<Student> findAll();
}
