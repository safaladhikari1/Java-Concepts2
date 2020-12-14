package examples;

import java.util.ArrayList;

public class UsingJavasArrayList 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		/*
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		*/
		
		for(int i=100; i <=1100; i+=100)
		{
			numbers.add(i);
		}
		
		System.out.println(numbers.toString());
		
		//size related methods		
		System.out.println("size(): " + numbers.size());		
		System.out.println("isEmpty(): " + numbers.isEmpty());
		
		//loop and remove all elements from the internal array
		numbers.clear();
		System.out.println("isEmpty(): " + numbers.isEmpty());
		
		//add(index) - insert operation
		for(int i=1; i <= 100; i++)
		{
			//causes shifting - BAD!!!
			numbers.add(0, i);
		}
		System.out.println(numbers.toString());
		
		//remove by index or element
		
		//Integer number = new Integer(100);
		//numbers.remove(number);
		
		numbers.remove(new Integer(100));		
		System.out.println(numbers.toString());
		
		numbers.remove(3);
		System.out.println(numbers.toString());
		
		//get() and set()
		System.out.println(numbers.get(0)); //akin to square bracket notation with arrays
		System.out.println(numbers.set(0, 1000));
		System.out.println(numbers.toString());
		
		//contains()
		System.out.println("contains(): " + numbers.contains(1000));
		System.out.println("contains(): " + numbers.contains(2000));
		
		//loop over an arrayList (not like an array!)
		
		/*
		for(int i=0; i<numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		*/
		
		for(int i=0; i<numbers.size(); i++)
		{
			System.out.print(numbers.get(i) + ", ");
		}
		System.out.println(); //new line
		
		//for-each loop (enhanced for loop), for dataStructures that doesn't support indices	
		//for each "int element" in "numbers" dataStructure 
		for(int element: numbers) //auto-unboxing
		{
			System.out.print(element + ", ");
		}
		System.out.println(); //new line
		
		//be sure to be careful when interacting with operations
		//in the array list class (avoid shifting)
		
		numbers.clear();
		
		System.out.println("Start work...");
		
		
		for(int i=1; i<=1000000; i++)
		{
			numbers.add(i);
		}
		System.out.println("End work...");
		
		
		/*
		 * 
		for(int i=1; i<=1000000; i++)
		{
			numbers.add(0, i); //shifting is BAD!
		}
		System.out.println("End work...");
		*/
				
	}
}
