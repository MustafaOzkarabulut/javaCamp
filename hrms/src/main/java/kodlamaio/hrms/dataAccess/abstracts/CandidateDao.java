package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Candidates;
import kodlamaio.hrms.entities.concretes.Job_Advertisement;

public interface CandidateDao extends JpaRepository<Candidates, Integer>{
	
}
