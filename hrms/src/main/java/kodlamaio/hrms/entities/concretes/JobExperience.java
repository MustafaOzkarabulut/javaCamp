package kodlamaio.hrms.entities.concretes;

import java.sql.Date;
import java.util.List;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="job_experience")
public class JobExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="business_name")
	private String businessName;
	
	@Column(name="job_position")
	private String jobPosition;
	
	@Column(name="experience_start_date")
	private Date experienceStartDate;
	
	@Column(name="experience_end_date")
	private Date experienceEndDate;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidates candidates;
	
	@JsonIgnore
    @OneToMany(mappedBy = "jobExperience")
    private List<Resume> resume;
	


	

	
}
