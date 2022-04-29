package ap;

public class Stadium extends Venue{

	private final int premSeat = 200;
	private final int genSeat = 75;
	private final int maxPrem;
	private final int maxGen;
	private int premSold, genSold;
	private double revenue;
	
	public Stadium(String name, int capacity, int premiumSeats) 
	 {
	 super(name, capacity);
	 maxPrem = premiumSeats;
	 maxGen = capacity - premiumSeats;
	 }
	
	public double getRevenue() {
		revenue = premSeat * maxPrem + genSeat * maxGen;
		return revenue;
	}
	
}

