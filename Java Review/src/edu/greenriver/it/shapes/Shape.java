package edu.greenriver.it.shapes;

public abstract class Shape 
{
	//Static constant so you have only one field
	//floating around no matter how many shape objects
	//you create.
	private static final int MAX_NAME_LENGTH = 20;
	
	private String name;
	
	public Shape(String name) 
	{
		this.name = name;
		
		//Can't do it, this is final
		//MAX_NAME_LENGTH = 30;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public static int getMaxNameLength()
	{
		//Cannot access non-static field "name" from static method
		//System.out.println("Shape name is " + name);
		return MAX_NAME_LENGTH;
		
		//toString() method is calling non-static fields, name
		//System.out.println(toString());
	}
	
	//do we know anything about the area of this shape?
	
	/*
	 * 	we basically put area() method in a parent class
	    so that it can be overridden in a child class
	    so println(shapes[i]. area()); works on main.
	
	public double area()
	{
		//What should we return here?
		return 0.0;
	}
	 */

	//Or it is here just to be overridden
	public abstract double area();

	@Override
	public String toString() 
	{
		return "Shape [name=" + name + "]";
	}	
}























