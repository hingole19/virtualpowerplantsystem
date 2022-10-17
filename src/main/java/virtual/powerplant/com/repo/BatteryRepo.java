package virtual.powerplant.com.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import virtual.powerplant.com.entity.Battery;

public interface BatteryRepo extends MongoRepository<Battery, Integer> {

	@Query(value = "{'postcode':{'$gt':?0, '$lt' : ?1}}")
	List<Battery> findNamesBetweenRange(Long postcode1, Long postcode2);
	
}
