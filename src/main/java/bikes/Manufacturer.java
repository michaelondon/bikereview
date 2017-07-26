package bikes;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Manufacturer {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
       
    @Lob
    private String description;
    private String review;
    
    @OneToMany (mappedBy= "brand") 
    private Set<BikeModel> models;		
	

	public String getDescription() {
		return description;
	}

	public String getReview() {
		return review;
	}

	public String getName() {
		return name;
	}

	public Manufacturer (String name) {
		this.name = name;
	}

	public Manufacturer() {
	}
	

}