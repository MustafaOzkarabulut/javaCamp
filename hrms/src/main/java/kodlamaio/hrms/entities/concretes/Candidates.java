package kodlamaio.hrms.entities.concretes;

import java.sql.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper=false)
@Entity
@Data
@Table(name="candidates")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Candidates extends User{


	    @Column(name = "first_name")
	    private String name;

	    @Column(name = "last_name")
	    private String surname;
	    
	    @Column(name = "identification_number")
	    private String identification_number;

	    @Column(name = "birth_date")
	    private Date birthday;
	    
	    @JsonIgnore
	    @OneToMany(mappedBy = "candidates")
	    private List<Resume> resume;
	    
	    @JsonIgnore
	    @OneToMany(mappedBy = "candidates")
	    private List<JobExperience> jobExperience;
	    
	    @JsonIgnore
	    @OneToMany(mappedBy = "candidates")
	    private List<Language> language;
	    
	    @JsonIgnore
	    @OneToMany(mappedBy = "candidates")
	    private List<Technology> technology;
	    


	    
	    
	   
		
}
