package in.iiits.person;

public class Violator extends Person{
	private String Violation;
	private String Fine;
	
	public Violator(String ChallanNo,String Name, String VehicleNo, String Violation, String Fine) {
		super(ChallanNo,Name,VehicleNo);
		this.Violation = Violation;
		this.Fine = Fine;
	}

	@Override
	String Violation() {
		return Violation;
	}

	@Override
	String Fine() {
		return Fine;
	}
	public void setViolation(String Violation) {
		this.Violation = Violation;
	}
	
	public String getViolation() {
		return Violation;
	}
	
	public void setFine(String Fine) {
		this.Fine = Fine;
	}
	
	public String getFine() {
		return this.Fine;
	}
	
	@Override
	public String toString() {
		
		return "\n" +ChallanNo+ "		" +Name+ "		" +VehicleNo+ "		" +Violation+ "		" +Fine + "\n";
	}

}

