package service;

import com.app.studentregistration.model.Student;
import com.app.studentregistration.repo.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface studentService {
    List<Student> viewStudentData();

    String addStudent(Student student);

}
