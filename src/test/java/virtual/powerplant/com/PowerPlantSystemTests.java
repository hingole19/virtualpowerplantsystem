package virtual.powerplant.com;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mongodb.assertions.Assertions;

import virtual.powerplant.com.entity.Battery;
import virtual.powerplant.com.repo.BatteryRepo;



@SpringBootTest
class PowerPlantSystemTests {

	@Autowired
	BatteryRepo battery;

	@Test
	void contextLoads() {
	}
	
	@Test
	void checkRange() {
		List<Battery> names = battery.findNamesBetweenRange(Long.valueOf(121),Long.valueOf(3232));
		Assertions.assertNotNull(names);
	}

}
