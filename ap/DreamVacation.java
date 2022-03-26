package ap;

public class DreamVacation {

	String destination;
	double cost;
	
	public DreamVacation() {
			
	}
	
	public DreamVacation(String myDestination, double myCost) 
	{
	destination = myDestination;
	cost = myCost;
	}
	
	public String getLocation() {
		return destination;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double myCost) {
		cost = myCost;
	}
	
	
	public void setLocation(String myLocation) {
		destination = myLocation;
	}
}
