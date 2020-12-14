package examples;

public class Beaver extends Animal
{
	//fields
	private double swimSpeed;
	
	//constructors
	public Beaver(double swimSpeed, int age)
	{
		super("Beaver", age);
		
		this.swimSpeed = swimSpeed;
	}
	
	//methods
	
	public void setSwimSpeed(double swimSpeed)
	{
		this.swimSpeed = swimSpeed;
	}
	
	public double getSwimSpeed()
	{
		return swimSpeed;
	}
	
	public String toString()
	{
		return "Beaver: " + swimSpeed + ", " +  super.toString();
	}	
}















