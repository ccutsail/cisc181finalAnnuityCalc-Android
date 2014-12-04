
public abstract class Vehicle implements VehicleInterface {
//Attributes: Name, Color, Weight, Owner 
	//(which is of type Person)
//Methods: transferOwnership(Person newOwner)
	String Name;
	String Color;
	double Weight;
	Person Owner;
	
	protected void newOwner(Person Owner){
		
		this.Owner = Owner;
		
	}
	
	
	
}
