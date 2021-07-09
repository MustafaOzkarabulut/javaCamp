package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.entities.concretes.Job_Advertisement;

@RestController
@RequestMapping("api/jobadvertisements")
@CrossOrigin
public class JobAdvertisementController {
	
	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}

	@GetMapping("/getall")
	public DataResult<List<Job_Advertisement>> getAll() {
		return this.jobAdvertisementService.getAll();
	}
	

	@GetMapping("/getAllAsc") 
	public DataResult<List<Job_Advertisement>> getAllSmallSorted() {
		return this.jobAdvertisementService.getAllSmallSorted();
	}
	
	
	@GetMapping("/getAllDesc") 
	public DataResult<List<Job_Advertisement>> getAllSorted() {
		return this.jobAdvertisementService.getAllSorted();
	}
	
    @GetMapping("/getByisActiveAndCompanyName")
    DataResult<List<Job_Advertisement>> getByCompanyName(@RequestParam String companyName){
        return this.jobAdvertisementService.getByCompanyName(companyName);
    }
    
    @PostMapping("/updateIsActiveById")
    public Result updateIsActiveById(@RequestParam int employersId,@RequestParam int jobAdvertisementId,@RequestParam boolean active){
        return this.jobAdvertisementService.updateIsActiveByEmployerIdAndId(employersId,jobAdvertisementId,active);
    }
	

	@PostMapping("/add")
	public Result add(@RequestBody Job_Advertisement job_Advertisement) {
		return this.jobAdvertisementService.add(job_Advertisement);
	}
	
	
	
	
}
