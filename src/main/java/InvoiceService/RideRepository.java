package InvoiceService;

import java.util.ArrayList;
import java.util.HashMap;

public class RideRepository {
	HashMap<String,ArrayList<Ride>> ridesMap;
	
	public RideRepository() {
		this.ridesMap = new HashMap<>();
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
