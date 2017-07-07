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
	private String taste;

	@Lob
	private String review;

	@ManyToOne
	private Brand brand;

	public Brand getBrand() {
		return brand;
	}

	public void setBrands(Brand brand) {
		this.brand = brand;
	}

	public Long getId() {
		return id;
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

	public BikeModel(Brand brand, Long id, String name, String imageURL, String review, String taste) {
		this.brand = brand;
		this.id = id;
		this.name = name;
		this.imageURL = imageURL;
		this.review = review;
		this.taste = taste;
	}


}