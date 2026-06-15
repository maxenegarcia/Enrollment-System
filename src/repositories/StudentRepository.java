package repositories;

import models.Student;
import java.util.List;

public interface StudentRepository {

    Student findById(String id);

    void save(Student student);

    List<Student> findAll();
}