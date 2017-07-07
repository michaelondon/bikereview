package bikes;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BikeController {
	@Resource
	private BrandRepository brandRepo;

	@Resource
	private BikeModelRepository modelRepo;

	
	@RequestMapping("/bikebrand") //returns all brand of bikes
	public String retrieveBrand(Model model) {
		model.addAttribute("brand", brandRepo.findAll());
		return "brandList";
	}

	@RequestMapping("/bikemodel") //returns bike joints from specific brand
	public String retrieveBikeModel(@RequestParam("id") long id, Model model) {
		model.addAttribute(brandRepo.findOne(id));
		return "bikemodel";
	}


	@RequestMapping("/singleReview") //pulls one review
	public String retrieveSingleReview(@RequestParam("id") long id, Model model) {
		model.addAttribute(modelRepo.findOne(id));
		return "singleReview";
	}

}