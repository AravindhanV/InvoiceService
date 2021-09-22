package InvoiceService;

import java.util.ArrayList;
import java.util.HashMap;

public class RideRepository {
	HashMap<String,ArrayList<Ride>> ridesMap;
	private static RideRepository repository;
	
	private RideRepository() {
		this.ridesMap = new HashMap<>();
		repository=null;
	}
	
	public static RideRepository getInstance() {
		if(repository==null) {
			repository = new RideRepository();
		}
		return repository;
	}
	
	public void addRide(String uid, Ride ride) {
		if(ridesMap.get(uid) == null) {
			ridesMap.put(uid,new ArrayList<>());
		}
		ridesMap.get(uid).add(ride);
	}
	
	public Ride[] getRides(String uid) {
		Ride[] rides = new Ride[ridesMap.get(uid).size()];
		rides = ridesMap.get(uid).toArray(rides);
		return rides;
	}
}
