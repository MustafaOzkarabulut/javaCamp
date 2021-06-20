package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Education;
import kodlamaio.hrms.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/Education")
public class EducationController {
	
	private EducationService educationService;
	
	@Autowired
	public EducationController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Education education) {
		return this.educationService.add(education);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Education>> getall() {
		return this.educationService.getAll();
	}
	
	@GetMapping("/getAllAsc")
	public DataResult<List<Education>> getAllSmalSorted() {
		return this.educationService.getAllSmalSorted();
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<Education>> getAllSorted() {
		return this.educationService.getAllSorted();
	}
}
