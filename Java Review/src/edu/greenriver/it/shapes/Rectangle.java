package edu.greenriver.it.shapes;

public class Rectangle extends Shape
{
	private double width;
	private double height;
	
	public Rectangle(double width, double height)
	{
		super("rectangle");
		
		this.width = width;
		this.height = height;
	}

	public double getWidth() 
	{
		return width;
	}

	public double getHeight() 
	{
		return height;
	}
	
	public double area()
	{
		return width * height;
	}

	@Override
	public String toString() 
	{
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}	
}












