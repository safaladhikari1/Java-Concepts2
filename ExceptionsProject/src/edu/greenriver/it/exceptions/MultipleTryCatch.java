package edu.greenriver.it.exceptions;

import java.util.*;

public class MultipleTryCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner consoleScanner = new Scanner(System.in);
			getUserInputs(consoleScanner);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public static void getUserInputs(Scanner console)
	{
		try
		{
			String firstName = getInput(console, "First name: ");
			String lastName = getInput(console, "Last name: ");
			String zip = getInput(console, "Zip: ");
			
			validate("first name", firstName);
			validate("last name", lastName);
			validate("zip", zip);
			
		}
		catch(InputMismatchException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public static String getInput(Scanner console, String prompt)
	{
		System.out.print(prompt);
		return console.nextLine();
	}
	
	public static void validate(String type, String value)
	{
		if(type.contains("name") && value.length() == 0)
		{
			throw new NoSuchElementException("Empty name value!");
		}
		
		//assume zip code is only 5 digit variety
		else if (type.equals("zip") && value.length() != 5)
		{
			throw new InputMismatchException("Incorrect zip format!");
		}
	}

}

























