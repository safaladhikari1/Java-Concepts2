package edu.greenriver.it.shapes;

public class TestShapes 
{
	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle(10, 20);
		
		Square square = new Square(15);
		
		RightTriangle triangle = new RightTriangle(4, 3);
		
		//Shape myShape = new Shape("Polygon");
		
		//I'm using upcasting here (polymorphism)
		
		//shapes[i] is bringing us values from different objects of classes
		//dynamic behavior
		
		Shape[] shapes = {rect, square, triangle};
		
		for(int i=0; i<shapes.length; i++)
		{
			System.out.println(shapes[i].toString());
			System.out.println(shapes[i].area());
		}
		
		System.out.println(Shape.getMaxNameLength());
		
	}
}

















