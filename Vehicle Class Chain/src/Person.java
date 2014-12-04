import java.util.UUID;


public class Person {
	
	
	
	private String firstName;
	private String lastName;
	private UUID PersonID;

	public String getFirstName()
	{
	     //include validation, logic, logging or whatever you like here
	    return this.firstName;
	}
	public void setFirstName(String firstName)
	{
	     //include more logic
	     this.firstName = firstName;
	}
	
	public String getLastName()
	{
	     //include validation, logic, logging or whatever you like here
	    return this.lastName;
	}
	public void setLastName(String lastName)
	{
	     //include more logic
	     this.lastName = lastName;
	}
	public UUID getPersonID()
	{
	     //include validation, logic, logging or whatever you like here
	    return this.PersonID;
	}
	
	public void setPersonID()
	{
		
		UUID id = UUID.randomUUID();   
	     this.PersonID = id;
	}
}
