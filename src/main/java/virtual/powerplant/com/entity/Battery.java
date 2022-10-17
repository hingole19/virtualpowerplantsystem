package virtual.powerplant.com.entity;


import org.springframework.data.mongodb.core.mapping.Document;

@Document("battery")
public class Battery {

	private String name;
	private Long postcode;
	private Long capacity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPostcode() {
		return postcode;
	}
	public void setPostcode(Long postcode) {
		this.postcode = postcode;
	}
	public Long getCapacity() {
		return capacity;
	}
	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}
		
//	public int compareTo(Battery o) {
//
//		return this.getName().compareTo(o.getName());
//	}
}
