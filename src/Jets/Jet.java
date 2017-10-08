package Jets;

public class Jet {
	private Pilot pilot;
	private String model;
	private double speed;
	private double range;
	private String lastMaintance;
	private int price;
	
	
	public Jet(Pilot pilot, String model, double speed, double range, String lastMaintance, int price) {
		this.pilot = pilot;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.lastMaintance = lastMaintance;
		this.price = price;
	}

	Jet(Pilot pilot){
		this.pilot = pilot;
		
	}
	
	Jet(){
		this(new Pilot("unknown"));
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public String getLastMaintance() {
		return lastMaintance;
	}

	public void setLastMaintance(String lastMaintance) {
		this.lastMaintance = lastMaintance;
	}
	
	
}
