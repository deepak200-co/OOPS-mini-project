package in.iiits.person;

abstract class Person {
	protected String ChallanNo;
	protected String Name;
	protected String VehicleNo;
	
	public Person(String ChallanNo,String Name, String VehicleNo) {
		this.ChallanNo = ChallanNo;
		this.Name = Name;
		this.VehicleNo = VehicleNo;
	}
	
	public void setChallanNo(String ChallanNo) {
		this.ChallanNo = ChallanNo;
	}
	
	public String getChallanNo() {
		return ChallanNo;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setVehicleNo(String VehicleNo) {
		this.VehicleNo = VehicleNo;
	}
	
	public String getVehicleNo() {
		return VehicleNo;
	}
	
	abstract String Violation();
	abstract String Fine();
	
	
}
