package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.entities.concretes.Job;

public interface JobService {
	List<Job> getAll();
	Result add(Job job);
}
