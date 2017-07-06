package bikes;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BikePopulator implements CommandLineRunner {

	@Resource
	private MakeRepository makeRepo;

	@Resource
	private ModelRepository modelRepo;

	@Override
	public void run(String... args) throws Exception {
		Make scott = new Make("Scott");
		Make canyon  = new Make("Canyon");
		Make cannondale = new Make("Cannondale");
		Make specialized = new Make("Specialized");

		makeRepo.save(scott);
		makeRepo.save(canyon);
		makeRepo.save(cannondale);
		makeRepo.save(specialized);

		Model caad12= new Model(cannondale, 1L, "CAAD12", "images/caad12.jpeg", "4 out of 5 Wheels!",
				"CAAD12: This establishment seems to be the new hip place to visit for DIY tacos. ");
		
		Model supersix= new Model(cannondale, 2L, "SUPERSIX EVO DISC", "images/supersix.jpeg", "4 out of 5 Wheels!",
				"SUPERSIX EVO DISC: This establishment seems to be the new hip place to visit for DIY tacos. ");
		
		Model tarmac= new Model(specialized, 3L, "Tarmac", "images/tarmac.jpeg", "3 out of 5 Wheels!",
				"S-Works Tarmac Ultralight: This establishment seems to be the new hip place to visit for DIY tacos. ");
		
		Model roubaix = new Model(specialized, 4L, "Roubaix", "images/roubaix.jpeg", "3 out of 5 Wheels!",
				"S-Works Roubaix eTap Tacos: This establishment seems to be the new hip place to visit for DIY tacos. ");
		
		Model ultimate  = new Model(canyon , 5L, "Ultimate", "images/ultimate .jpeg", "4.5 out of 5 Wheels!",
				"Ultimate: This establishment seems to be the new hip place to visit for DIY tacos. ");
		
		Model endurace = new Model(canyon , 6L, "Endurace", "images/endurace.jpeg", "3.5 out of 5 Wheels!",
				"Endurace: This establishment seems to be the new hip place to visit for DIY tacos. ");
		
		Model solace = new Model(scott, 7L, "Solace", "images/solace.jpeg", "4 out of 5 Wheels!",
				"Solace: This establishment seems to be the new hip place to visit for DIY tacos. ");
		
		Model cr1 = new Model(scott, 8L, "CR1", "images/cr1.jpeg", "4.5 out of 5 Wheels!",
				"CR1: This establishment seems to be the new hip place to visit for DIY tacos. ");

		modelRepo.save(caad12);
		modelRepo.save(supersix);
		modelRepo.save(tarmac);
		modelRepo.save(roubaix);
		modelRepo.save(ultimate );
		modelRepo.save(endurace);
		modelRepo.save(solace);
		modelRepo.save(cr1);

	}
}