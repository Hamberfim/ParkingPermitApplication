package dmacc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import dmacc.beans.Student;
import dmacc.repository.StudentRepository;

@Controller
public class IndexController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/")
	public String index(Model model) {
		
		List<Student> listStudents = studentRepository.findAll();
		
		model.addAttribute("listStudents", listStudents);
		
		return "index";
		
	}


}
