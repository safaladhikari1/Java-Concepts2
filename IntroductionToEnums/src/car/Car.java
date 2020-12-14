package car;

public class Car
{
	private int year;
	private Model model;
	private Color color;
	
	public Car(int yr, Model m, Color c)
	{
		year = yr;
		model = m;
		color = c;
	}
	
	public void display()
	{
		System.out.println("Car is a " + year + 
				" " + color + " " + model);
		
	    System.out.println("name\tage\theight");
	    System.out.println("Archie\t17\t5'9\"");
	    System.out.println("Betty\t17\t5'6\"");
	    System.out.println("Jughead\t16\t6'");
	    System.out.println("hi\thello\tgoodbye\tbeautiful\thi");
	}		
}













