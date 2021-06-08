package kodlamaio.hrms.entities.concretes;

import java.sql.Date;
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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "job_advertisements")
public class Job_Advertisement{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int jobAdvertisementId;
	
	@Column(name = "job_position")
	private String job_position;
	
	@Column(name = "job_description")
	private String job_description;
	
	@Column(name = "min_salary")
	private int min_salary;
	
	@Column(name = "max_salary")
	private int max_salary;
		
	@Column(name = "open_position")
	private int open_position;
	
	@Column(name = "application_deadline")
	private Date applicationDeadline;
	
	@Column(name="active")
	private boolean active;

	@ManyToOne
	@JoinColumn(name="employers_id")
	private Employers employers;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
}
