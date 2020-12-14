package edu.greenriver.it.exceptions;

import java.util.Scanner;

public class Divide
{	
	/*
	 * Perspective B: I'm using an interesting method or class and I want
	 * to respond to any exceptions that are thrown (when things go wrong)
	 */
	public static void main(String[] args)
	{
		try
		{
			getUserInputs();
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(IllegalArgumentException ex)
		{
			System.out.println(ex.getMessage());
		}		
	}
	
	//also perspective A:
	public static void getUserInputs()
	{
		Scanner console = new Scanner(System.in);	
		//prompt the user for two numbers and show the result of division
		
		System.out.print("Enter a non-negative numerator: ");
		int numerator = console.nextInt();
		
		//our routine does not support negative inputs
		if(numerator < 0)
		{
			throw new ArithmeticException("Your numerator " + numerator + 
					" cannot be negative.");
		}
		
		System.out.print("Enter a non-negative denominator: ");
		int denominator = console.nextInt();
		
		//our routine does not support negative inputs
		if(denominator < 0)
		{
			throw new ArithmeticException("Your denominator " + denominator + 
					" cannot be negative.");
		}
		
		System.out.println("The result of " + numerator + " /" + 
						denominator + " is " + divide(numerator,denominator));
		
		console.close();
		
	}
		
	/*Perspective A: I'm writing a class or method that is interesting
	 *and useful, and if my method or class receives bad inputs or something
	 *goes wrong. I'm going to then throw an exception and be done.
	 */
	
	public static int divide(int numerator, int denominator)
	{
		//precondition: something that must be true for a method to continue
		
		if(denominator == 0)
		{
			throw new DivideByZeroException("You tried to divide " + 
					numerator + " by zero!");
		}
			
		return numerator/denominator;
	}
}













