package bikes;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BikePopulator implements CommandLineRunner {

	@Resource
	private BrandRepository brandRepo;

	@Resource
	private BikeModelRepository modelsRepo;

	@Override
	public void run(String... args) throws Exception {
		Manufacturer scott = new Manufacturer("Scott");
		Manufacturer canyon  = new Manufacturer("Canyon");
		Manufacturer cannondale = new Manufacturer("Cannondale");
		Manufacturer specialized = new Manufacturer("Specialized");

		brandRepo.save(scott);
		brandRepo.save(canyon);
		brandRepo.save(cannondale);
		brandRepo.save(specialized);

		BikeModel caad12= new BikeModel(cannondale, "CAAD12", "images/caad12.jpeg", "4 out of 5 Wheels!",
				"CAAD12: a light, stiff and smooth aluminum road bike.");
		
		BikeModel supersix= new BikeModel(cannondale, "SUPERSIX EVO DISC", "images/supersix.jpeg", "4 out of 5 Wheels!",
				"SUPERSIX EVO DISC: very comfortable and smooth with disc stopping power.");
		
		BikeModel tarmac= new BikeModel(specialized, "Tarmac", "images/tarmac.jpeg", "3 out of 5 Wheels!",
				"S-Works Tarmac Ultralight: a machine made for competing, anywhere and everywhere.");
		
		BikeModel roubaix = new BikeModel(specialized, "Roubaix", "images/roubaix.jpeg", "3 out of 5 Wheels!",
				"S-Works Roubaix eTap: suspension, ride quality, awesomely capable. ");
		
		BikeModel ultimate  = new BikeModel(canyon , "Ultimate", "images/ultimate .jpeg", "4.5 out of 5 Wheels!",
				"Ultimate: sleek, but doesn’t require Houdini-like contortions nor feel strained. ");
		
		BikeModel endurace = new BikeModel(canyon , "Endurace", "images/endurace.jpeg", "3.5 out of 5 Wheels!",
				"Endurace: perfectly captures the current zeitgeist in road bike development. ");
		
		BikeModel solace = new BikeModel(scott, "Solace", "images/solace.jpeg", "4 out of 5 Wheels!",
				"Solace: bike responeds on command and make hills much easier. ");
		
		BikeModel cr1 = new BikeModel(scott, "CR1", "images/cr1.jpeg", "4.5 out of 5 Wheels!",
				"CR1: very light and responsive great price point. ");

		modelsRepo.save(caad12);
		modelsRepo.save(supersix);
		modelsRepo.save(tarmac);
		modelsRepo.save(roubaix);
		modelsRepo.save(ultimate );
		modelsRepo.save(endurace);
		modelsRepo.save(solace);
		modelsRepo.save(cr1);

	}
}

