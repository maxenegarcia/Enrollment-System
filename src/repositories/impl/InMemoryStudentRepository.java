package repositories.impl;

import models.Student;
import repositories.StudentRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {

    private Map<String, Student> students = new HashMap<>();

    @Override
    public Student findById(String id) {
        return students.get(id);
    }

    @Override
    public void save(Student student) {
        students.put(student.getId(), student);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }
}