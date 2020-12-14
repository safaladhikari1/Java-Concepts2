package examples;

public class Animal extends Organism
{
	//fields
	private String type; //raccoon, mouse, bear, cat...
	
	//constructors
	public Animal(String type, int age)
	{
		//must be the first line of code in a constructor..
		super(age);
		
		this.type = type;
	}
	
	//methods	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String toString()
	{
		/*
		 * Rule #4: If you don't declare a parent class for a new class,
		 * then object automatically becomes the parent class.
		 * 
		 * On parent Organism class,
		 * public class Organism extends Object
		 * {
		 *    toString() method comes from Object class
		 * }
		 */
	
		return "Type: " + type + ", " +  super.toString();
	}
	
}












