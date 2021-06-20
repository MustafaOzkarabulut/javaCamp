package kodlamaio.hrms.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EducationDao;
import kodlamaio.hrms.entities.concretes.Education;
import kodlamaio.hrms.entities.concretes.JobExperience;

@Service
public class EducationManager implements EducationService{

	private EducationDao educationDao;
	
	@Autowired
	public EducationManager(EducationDao educationDao) {
		this.educationDao = educationDao;
	}
	
	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(this.educationDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Education education) {
		this.educationDao.save(education);
		return new SuccessResult("Kayıt Başarılı");
	}

	@Override
	public DataResult<List<Education>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"schoolEndDate");
		return new SuccessDataResult<List<Education>>
		(this.educationDao.findAll(sort),"Başarılı");
	}

	@Override
	public DataResult<List<Education>> getAllSmalSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC,"schoolEndDate");
		return new SuccessDataResult<List<Education>>
		(this.educationDao.findAll(sort),"Başarılı");
	}

}
