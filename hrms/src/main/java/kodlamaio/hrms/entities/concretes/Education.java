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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="education")
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id ;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="section_name")
	private String sectionName;
	
	@Column(name="school_start_date")
	private Date schoolStartDate;
	
	@Column(name="school_end_date")
	private Date schoolEndDate;
	
	@ManyToOne
	@JoinColumn(name = "candidates_id")
	private Candidates candidates;
	
	
	@JsonIgnore
    @OneToMany(mappedBy = "education")
    private List<Resume> resume;
	
	

	
	
}
