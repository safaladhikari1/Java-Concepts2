package examples;

public class TestOrganisms 
{

	public static void main(String[] args) 
	{
		//Organism myOrganism = new Organism();
		
		//Since we have Organism constructor in Organism class, there is
		//no default constructor for above.
		
		Organism myOrganism = new Organism(10);
		
		//this will print out the toString of my object
		System.out.println(myOrganism);
		
		myOrganism.makeSound("...");
		
		//test out our child classes
		Person bob = new Person("Bob Smith", 30);	
		System.out.println(bob);
		bob.makeSound("Hello everyone!");
		
		Animal susy = new Animal("Bear", 10);
		System.out.println(susy);
		susy.makeSound("rawrrr");
		
		Cat furrBall = new Cat("British Short Hair", true, 3);
		System.out.println(furrBall);
		
		Beaver bart = new Beaver(30.5, 10);
		System.out.println(bart);
		
		//this technique is called upcasting
		//Casting this variables uptowards the class heirarchy
		Organism[] organisms = {bob, susy, furrBall, bart};
		
		for(int i=0; i<organisms.length; i++)
		{
			//System.out.println("Age: " + organisms[i].getAge());
			
			System.out.println("toString(): " + organisms[i].toString());
		}
		
		
	}

}











