package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="resumes")
public class Resume {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="github_link")
	private String githubLink;

	@Column(name="linkedin_link")
	private String linkedinLink;
	
	@Column(name="photo")
	private String photo;
	
	@Column(name="description")
	private String description;
	
	//*******************************************************************
	

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidates candidates;
    
    @ManyToOne
    @JoinColumn(name = "education")
    private Education education;
    
    @ManyToOne
    @JoinColumn(name = "candidate_technology_id")
    private Technology technology;
    
    @ManyToOne
    @JoinColumn(name = "language")
    private Language language;
    
    @ManyToOne
    @JoinColumn(name = "job_experience")
    private JobExperience jobExperience;
    



	
   
    
	//*******************************************************************

	
}
