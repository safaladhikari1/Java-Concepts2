package pens;

public class Pen
{
	private PenType type; //ball-point, roller-ball, fountain
	private String thickness; //fine, regular, thick
	private String color; //red, white, green
	
	//constructors
	public Pen(PenType type, String thickness, String color)
	{
		//Could we use our setters here?	
		this.type = type;
		this.thickness = thickness;
		this.color = color;
	}
	
	//setters
	public void setType(PenType type)
	{
		//prevent bad type values
		/*
		if(type.equals("ball-point") || type.equals("roller-ball") || type.equals("fountain"))
		{
			this.type = type;
		}
		else
		{
			//stop? terminate our program? let the user know?
			System.out.println("STOP!");
		}
		*/
		this.type = type;
	}
	
	public void setThickness(String thickness)
	{
		/*
		//prevent bad thickness values
		if(thickness.equals("fine") || thickness.equals("regular") || thickness.equals("thick"))
		{
			this.thickness = thickness;
		}
		else
		{
			//stop? terminate our program? let the user know?
			System.out.println("STOP!");
		}
		*/
		
		this.thickness = thickness;
	}
	
	public void setColor(String color)
	{
		/*
		//prevent bad color values
		if(color.equals("red") || color.equals("white") || color.equals("green"))
		{
			this.color = color;
		}
		else
		{
			//stop? terminate our program? let the user know?
			System.out.println("STOP!");
		}
		*/
		this.color = color;
	}
		
	//getters	
	public PenType getType()
	{
		return type;
	}
	
	public String getThickness()
	{
		return thickness;
	}
	
	//methods	
	public String toString()
	{
		return "Type: " + type + " Thickness: " + thickness +
				" color: " + color;
	}
}


















