package InvoiceService;

public class Ride {
	private double distance;
	private int time;
	private RideType type;
	
	public static enum RideType {
		RIDE_NORMAL,
		RIDE_PREMIUM
	}
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public Ride(double distance, int time,RideType type) {
		this.distance = distance;
		this.time = time;
		this.type = type;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public RideType getType() {
		return type;
	}

	public void setType(RideType type) {
		this.type = type;
	}
}
