package edu.greenriver.it.class_design;

public class Pet extends Animals
{
	private String name;
	private boolean hasCollar;
	
	public Pet(String type, double weight, String name, boolean hasCollar)
	{
		super(type, weight);
		
		this.name = name;
		this.hasCollar = hasCollar;
	}
	
	public void feed()
	{
		//System.out.println("My name is " + type);
		
		System.out.println("My name is " + name);
	}
}
