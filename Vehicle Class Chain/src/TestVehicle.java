
public class TestVehicle {

	public static void main(String[] args){
		
		Person a = new Person();
		a.setFirstName("a");
		a.setLastName("b");
		a.setPersonID();
		Car Protege = new Car();
		Protege.Owner = a;
		Protege.NumberOfDoors = 4;
		System.out.print(Protege.Owner.getFirstName());
		Person b = new Person();
		b.setFirstName("b");
		b.setLastName("a");
		b.setPersonID();
		Truck F150 = new Truck();
		F150.NumberOfAxles = 2;
		F150.Owner = b;
		Protege.newOwner(b);
		Motorcycle Ducati = new Motorcycle();
		Ducati.HasSidecar = false;
		System.out.print(Protege.Owner.getFirstName());
		System.out.print(F150.Owner.getFirstName());
		System.out.print(Protege.NumberOfDoors);
		System.out.print(Ducati.HasSidecar);
		
		
	}
}
