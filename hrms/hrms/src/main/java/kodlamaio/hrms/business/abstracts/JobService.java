package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.job;

public interface JobService {
	List<job> getAll();
}
