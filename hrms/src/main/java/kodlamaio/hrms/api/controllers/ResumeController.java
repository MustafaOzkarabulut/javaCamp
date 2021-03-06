package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Education;
import kodlamaio.hrms.entities.concretes.Job_Advertisement;
import kodlamaio.hrms.entities.concretes.Resume;

@RestController
@RequestMapping("api/resume")
@CrossOrigin
public class ResumeController {
	private ResumeService resumeService;
	
	@Autowired
	public ResumeController(ResumeService resumeService) {
		super();
		this.resumeService = resumeService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Resume resume) {
		return this.resumeService.add(resume);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Resume>> getall() {
		return this.resumeService.getAll();
	}
}
