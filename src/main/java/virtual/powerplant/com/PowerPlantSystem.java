package virtual.powerplant.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@SpringBootApplication
@EnableMongoRepositories
public class PowerPlantSystem {

	public static void main(String[] args) {
		SpringApplication.run(PowerPlantSystem.class, args);
	}
}
