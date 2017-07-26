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
	private BikeModelRepository modelsRepo;

	
	@RequestMapping("/allbikebrands") //returns all brands of bikes
	public String retrieveBrands(Model model) {
		model.addAttribute("brand", brandRepo.findAll());
		return "allbikebrands";
	}

	@RequestMapping("/modelsforbrand") // should be modelsforbrand
	public String retrieveBikeModel(Model model) {
		model.addAttribute("bikeModel", modelsRepo.findAll());
		return "bikemodelList";}
	

		
	@RequestMapping("/bikemodel") // returns bike models from specific brand
	public String retrieveBikeModels(@RequestParam("id") long id, Model model) {
		model.addAttribute("bike", brandRepo.findOne(id));
		return "bike";	}



	@RequestMapping("/singleReview") //pulls one review
	public String retrieveSingleReview(@RequestParam("id") long id, Model model) {
		model.addAttribute("singleReview", modelsRepo.findOne(id)); //singleReview this is a view name
		return "singleReview"; //this is a returned template name.
	}

}