package service;

import com.app.studentregistration.model.Student;
import com.app.studentregistration.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sudentServiceImpl implements studentService{
    @Autowired
    private StudentRepository studentrepo;

    @Override
    public List<Student> viewStudentData() {
        return studentrepo.findAll();
    }

    @Override
    public String addStudent(Student student) {
        studentrepo.save(student);
        return "student Added";
    }
    
//
//    @Override
//    public String updateStudent(Student student) {
//        String msg;
//        if(student.getId() != null){
//            studentrepo.save(student);
//            msg = "Student details Updated";
//
//        }else{
//            msg = "Student details cannot Updated";
//        }
//        return msg;
//
//    }
//
//    @Override
//    public void deleteStudent(int id) {
//        studentrepo.deleteById(id);
//    }
//}
}
