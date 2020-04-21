package dmacc.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dmacc.beans.Student;
import dmacc.beans.Vehicle;
import dmacc.repository.StudentRepository;
import dmacc.repository.VehicleRepository;

@Controller
public class IndexController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Student> listStudents = studentRepository.findAll();
		model.addAttribute("listStudents", listStudents);
		

		List<Vehicle> listAllVehicle = vehicleRepository.findAll();
		model.addAttribute("listAllVehicle", listAllVehicle);

		return "index";
		
	}
	


}
