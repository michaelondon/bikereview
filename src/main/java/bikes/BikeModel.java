package bikes;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class BikeModel {

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
	private Manufacturer brand;

	public Manufacturer getBrand() {
		return brand;
	}


	public String getImageURL() {
		return imageURL;
	}

	public String getRide() {
		return getRide();
	}

	public String getReview() {
		return review;
	}

	public String getName() {
		return name;
	}

	private BikeModel() {
	}

	public BikeModel(Manufacturer brand, String imageURL, String ride, String name, String review) {
		this.brand = brand;
		this.imageURL = imageURL;
		this.ride = ride;
		this.name = name;
		this.review = review;
	}

	


}