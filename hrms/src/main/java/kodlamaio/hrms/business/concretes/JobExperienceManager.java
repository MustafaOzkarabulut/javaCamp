package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.hrms.entities.concretes.JobExperience;
import kodlamaio.hrms.entities.concretes.Job_Advertisement;

@Service
public class JobExperienceManager implements JobExperienceService{

	private JobExperienceDao jobExperienceDao;
	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public Result add(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Kayıt Başarılı");
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(),"Data Listelendi");
	}

	@Override
	public DataResult<List<JobExperience>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"schoolEndDate");
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceDao.findAll(sort),"Başarılı");
	}

	@Override
	public DataResult<List<JobExperience>> getAllSmallSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC,"schoolEndDate");
		return new SuccessDataResult<List<JobExperience>>
		(this.jobExperienceDao.findAll(sort),"Başarılı");
	}


	
}