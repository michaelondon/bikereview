package bikes;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Brand {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@OneToMany(mappedBy="make")
	private Set<BikeModel> bike;
	
	public Set<BikeModel> getbike() {
		return bike;
	}
		
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Brand (String name) {
		this.name = name;
	}

	public Brand() {
	}
	

}