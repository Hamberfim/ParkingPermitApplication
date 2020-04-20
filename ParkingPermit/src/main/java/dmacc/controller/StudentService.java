package dmacc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dmacc.beans.Student;
import dmacc.repository.StudentDAO;

@Service
public class StudentService {
	
	@Autowired
	StudentDAO studentDao;
	
	public List<Student> getAllStudents() {
		return studentDao.findAll();
		
	}
	
	public Student createStudent(Student student) {
        return studentDao.save(student);
    }
	

}
