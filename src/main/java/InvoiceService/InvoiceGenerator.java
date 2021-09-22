/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InvoiceService;

import InvoiceService.Ride.RideType;

public class InvoiceGenerator {
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_FARE = 5;
	private static final double MINIMUM_COST_PER_KILOMETER = 10.0;

	private static final int PREMIUM_COST_PER_TIME = 2;
	private static final double PREMIUM_MINIMUM_FARE = 20;
	private static final double PREMIUM_MINIMUM_COST_PER_KILOMETER = 15.0;
	
    public double calculateFare(double distance,int time, RideType type) {
    	double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
    	return Math.max(MINIMUM_FARE, totalFare);
    }

	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		for(Ride ride : rides) {
			double fare = this.calculateFare(ride.getDistance(), ride.getTime(),ride.getType());
			totalFare += fare;
		}
		return new InvoiceSummary(rides.length,totalFare);
	}
	
	public InvoiceSummary calculateFare(String uid) {
		RideRepository rideRepository = RideRepository.getInstance();
		return calculateFare(rideRepository.getRides(uid));
	}
}
