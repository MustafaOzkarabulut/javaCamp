package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Job_Advertisement;

public interface JobAdvertisementDao extends JpaRepository<Job_Advertisement, Integer>{
	List<Job_Advertisement> getByEmployers_companyName(String companyName);
	Job_Advertisement getByEmployers_IdAndJobAdvertisementId(int employersId,int jobAdvertisementId);
	
}