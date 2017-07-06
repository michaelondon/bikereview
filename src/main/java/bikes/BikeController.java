package bikes;

import javax.annotation.Resource;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BikeController {
	@Resource
	private MakeRepository makeRepo;

	@Resource
	private ModelRepository modelRepo;

	
	@RequestMapping("/bikemake") //returns all make for bike
	public String retrieveRegion(Model model) {
		model.addAttribute("make", makeRepo.findAll());
		return "makeList";
	}

	@RequestMapping("/models") //returns bike from specific make
	public String retrieveModels(@RequestParam("id") long id, Model model) {
		model.addAttribute(((CrudRepository<bikes.Model, Long>) makeRepo).findOne(id));
		return "modelsList";
	}


	@RequestMapping("/singleReview") //pulls one review
	public String retrieveSingleReview(@RequestParam("id") long id, Model model) {
		model.addAttribute(modelRepo.findOne(id));
		return "singleReview";
	}

}