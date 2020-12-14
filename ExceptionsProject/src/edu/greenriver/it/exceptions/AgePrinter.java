package edu.greenriver.it.exceptions;

import java.util.*;

public class AgePrinter 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		printAge(keyboard);

	}
	
	public static void printAge(Scanner consoleScanner)
	{
		try
		{
			System.out.print("Please enter your age: ");
			int age = consoleScanner.nextInt();
		}
		catch(RuntimeException ex)
		{
			if (ex instanceof IllegalStateException)
			{
				//handle if the scanner was closed...
			}
			else if(ex instanceof NoSuchElementException)
			{
				//handle if the input is exhausted
			}
			else if(ex instanceof InputMismatchException)
			{
				//handle if the next token does not match the integer
				//regular expression, or is out of range
			}		
		}
		
		catch(Exception ex)
		{
			//this will respond to every type of exception that can be
			//thrown that is not already caught above.
		}
	}
}














