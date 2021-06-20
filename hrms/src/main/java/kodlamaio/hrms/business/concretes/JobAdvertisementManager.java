package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;

import kodlamaio.hrms.entities.concretes.Job_Advertisement;


@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		this.jobAdvertisementDao = jobAdvertisementDao;
	}
	
	
	@Override
	public Result add(Job_Advertisement job_Advertisement) {
		this.jobAdvertisementDao.save(job_Advertisement);
		return new SuccessResult("Yeni iş ilanı başarıyla eklendi");
	}

	@Override
	public DataResult<List<Job_Advertisement>> getAll() {
		return new SuccessDataResult<List<Job_Advertisement>>
		(this.jobAdvertisementDao.findAll(),"Data Listelendi");
	}


	@Override
	public DataResult<List<Job_Advertisement>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"applicationDeadline");
		return new SuccessDataResult<List<Job_Advertisement>>
		(this.jobAdvertisementDao.findAll(sort),"Başarılı");
	}
	
	@Override
	public DataResult<List<Job_Advertisement>> getAllSmallSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC,"applicationDeadline");
		return new SuccessDataResult<List<Job_Advertisement>>
		(this.jobAdvertisementDao.findAll(sort),"Başarılı");
	}


	@Override
	public DataResult<List<Job_Advertisement>> getByCompanyName(String companyName) {
		return new SuccessDataResult<>
		(this.jobAdvertisementDao.getByEmployers_companyName(companyName),"Data Listelendi");
		
	}


	@Override
	public Result updateIsActiveByEmployerIdAndId(int employersId, int jobAdvertisementId, boolean active) {
        Job_Advertisement jobAdvertisement=jobAdvertisementDao.getByEmployers_IdAndJobAdvertisementId(employersId, jobAdvertisementId);
        jobAdvertisement.setActive(active);
        jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("Updated");
	}

	
}


//getByEmployers_IdAndJobAdvertisementId(int employersId,int jobAdvertisementId);



