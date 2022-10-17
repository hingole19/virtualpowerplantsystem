package virtual.powerplant.com.service;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import virtual.powerplant.com.entity.Battery;
import virtual.powerplant.com.repo.BatteryRepo;

@Service
public class BatteryService {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private BatteryRepo batterRepo;

	public List<Battery> addBatteryDetails(List<Battery> battery) {
		log.info("Inside addBatteryDetails");
		return batterRepo.saveAll(battery);
	}

	public List<Battery> findNamesOfBattery(String postcoderange) {
		log.info("Inside findNamesOfBattery");
		String[] arrOfStr = postcoderange.split("-");
		Long postcode1 = Long.parseLong(arrOfStr[0]);
		Long postcode2 = Long.parseLong(arrOfStr[1]);
		List<Battery> batteryDetails = batterRepo.findNamesBetweenRange(postcode1, postcode2);
		Comparator<Battery> compareByName = (Battery o1, Battery o2) -> o1.getName().compareTo( o2.getName() );
		Collections.sort(batteryDetails, compareByName);
		log.info("Exit findNamesOfBattery");
		return batteryDetails;
		
	}
}
