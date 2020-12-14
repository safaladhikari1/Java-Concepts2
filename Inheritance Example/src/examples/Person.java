package examples;

//borrow the public fields/methods from Organism
public class Person extends Organism
{	
	//fields
	private String name;
	
	
	//constructors
	public Person(String name, int age)
	{
		/*
		 * Rule #2: If a call is not made to a super constructor
		 * in a child class, then an implicit call to super() "the
		 * default constructor in a parent class" is made automatically.
		 */
		//super(20);
		
		//Rule #3: A call to super() must be the first line of code in a constructor
		
		//store age in the parent class
		super(age);
		
		this.name = name;
	
	}
		
	//methods
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		//return "Person: " + name + ", age: " + getAge();
		//violates the DRY principle. toString() age is already made on parent class
		
		//recursion, toString() below is calling the toString() above
		
		return "Person: " + name + ", " + super.toString();
		
	}
	
	//Override (not overloading) a method I inherited
	//Overloading: declaring same method names on same class, with different parameters
	/*
	public void makeSound(String words)
	{
		System.out.println(name + " said " + words);
	}
	*/		
}

























