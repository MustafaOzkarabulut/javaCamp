package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employers;
import kodlamaio.hrms.entities.concretes.Job_Advertisement;

public interface JobAdvertisementService {
	
	Result add(Job_Advertisement jobAdvertisement);
	Result updateIsActiveByEmployerIdAndId(int employersId, int jobAdvertisementId,boolean active);
	DataResult<List<Job_Advertisement>> getAll();
	DataResult<List<Job_Advertisement>> getAllSorted();
	DataResult<List<Job_Advertisement>> getAllSmallSorted();
	DataResult<List<Job_Advertisement>> getByCompanyName(String companyName);

	

	//DataResult<List<Job_Advertisement>> getByActivated();
	//DataResult<List<Job_Advertisement>> getByActivatedOrderByReleaseDateAsc();
	//DataResult<List<Job_Advertisement>> getByActivatedOrderByApplicationDeadlineAsc();
	
	//Result activateJobAdvertisement(Integer id);
	//Result deactivateJobAdvertisement(Integer id);
	
	
}
