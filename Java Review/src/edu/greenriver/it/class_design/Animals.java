package edu.greenriver.it.class_design;

public class Animals 
{
	private String type;
	private double weight;
	
	public Animals(String type, double weight) 
	{
		this.type = type;
		this.weight = weight;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public double getWeight() 
	{
		return weight;
	}

	public void setWeight(double weight) 
	{
		this.weight = weight;
	}

	@Override
	public String toString() 
	{
		return "Animals [type=" + type + ", weight=" + weight + "]";
	}
	
	
	
	//protected String type;
	//protected double weight;
	
	//Package access modifier, all other classes on the 
	//same package can access the following fields.
	//String type;
	//double weight;
	
	
	
	
	
}
