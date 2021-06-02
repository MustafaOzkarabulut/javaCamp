package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

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
}
