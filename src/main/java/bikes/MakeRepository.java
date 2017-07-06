package bikes;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MakeRepository {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@OneToMany(mappedBy="make")
	private Set<Model> bikes;
	
	public Set<Model> getBikes() {
		return bikes;
	}
	
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public MakeRepository(String name) {
		this.name = name;
	}

	public MakeRepository() {
	}
	

}