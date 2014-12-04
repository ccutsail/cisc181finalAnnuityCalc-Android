import static org.junit.Assert.*;

import org.junit.Test;


public class VehicleTest {

	@Test
	public void test() {
		Person a = new Person();
		a.setFirstName("a");
		a.setLastName("b");
		a.setPersonID();
		Car Protege = new Car();
		Protege.Owner = a;
		Protege.NumberOfDoors = 4;
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
		   assertEquals("Person a first name is a",
				   "a", a.getFirstName());
		   assertEquals("Person a last name is b",
				   "b", a.getLastName());
		   assertEquals("Person has a UUID",
				   a.getPersonID(), a.getPersonID());
		   assertEquals("Person b owns Protege",
				   "b", Protege.Owner.getFirstName());
		   assertEquals("Protege has 4 doors",
				   4, Protege.NumberOfDoors);
		   assertEquals("F150 has 2 axles",
				   2, F150.NumberOfAxles);
		   assertEquals("Ducati has no sidecar",
				   false, Ducati.HasSidecar);
	}

}
