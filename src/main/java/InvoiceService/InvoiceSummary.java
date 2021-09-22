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
	private double averageFare;

	public InvoiceSummary(int noOfRides, double totalFare) {
		this.noOfRides = noOfRides;
		this.totalFare = totalFare;
		this.averageFare = totalFare/noOfRides;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		InvoiceSummary that = (InvoiceSummary) o;
		return noOfRides == that.noOfRides && Double.compare(that.totalFare, this.totalFare) == 0
				&& Double.compare(that.averageFare, this.averageFare) == 0;
	}
}
