package bikes;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Make {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@OneToMany(mappedBy="make")
	private Set<Model> bike;
	
	public Set<Model> getbike() {
		return bike;
	}
		
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Make (String name) {
		this.name = name;
	}

	public Make() {
	}
	

}