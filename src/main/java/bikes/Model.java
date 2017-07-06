package bikes;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Model {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String imageURL;
	
	@Lob
	private String ride;

	@Lob
	private String review;

	@ManyToOne
	private Make make;

	public Make getMake() {
		return make;
	}

	public void setMakes(Make make) {
		this.make = make;
	}

	public Long getId() {
		return id;
	}

	public String getImageURL() {
		return imageURL;
	}

	public String getTaste() {
		return ride;
	}

	public String getReview() {
		return review;
	}

	public String getName() {
		return name;
	}

	public Model(Make make, Long id, String name, String imageURL, String review, String ride) {
		this.make = make;
		this.id = id;
		this.name = name;
		this.imageURL = imageURL;
		this.review = review;
		this.ride = ride;
	}


}