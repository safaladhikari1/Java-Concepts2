package examples;

public class Cat extends Animal
{
	//fields
	private String breed;
	private boolean diva; //is the cat a diva?
	
	//constructors
	/*
	public Cat(String breed, boolean diva, String type, int age)
	{
		//super("Leo", 10);
		super(type, age);
		
		this.breed = breed;
		this.diva = diva;
	}
	*/
	
	//taking control of the constructor
	public Cat(String breed, boolean diva, int age)
	{
		//super("Leo", 10);
		super("Cat", age);
		
		this.breed = breed;
		this.diva = diva;
	}
	
	//methods
	
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	public void setDiva(boolean diva)
	{
		this.diva = diva;
	}
	
	//this is valid for a getter for a boolean field
	public boolean isDiva()
	{
		return diva;
	}
	
	public String toString()
	{
		return "Cat: " + breed + " (diva? " + diva + ") " + super.toString();
	}
	
}





















