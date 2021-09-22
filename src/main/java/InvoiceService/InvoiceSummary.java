package InvoiceService;

public class InvoiceSummary {
	private int noOfRides;
	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public int getNoOfRides() {
		return noOfRides;
	}
	
	public void setNoOfRides() {
		this.noOfRides = noOfRides;
	}

	private double totalFare;
	
	public InvoiceSummary(int noOfRides,double totalFare) {
		this.noOfRides = noOfRides;
		this.totalFare = totalFare;
	}
}
