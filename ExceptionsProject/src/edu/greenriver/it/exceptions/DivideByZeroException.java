package edu.greenriver.it.exceptions;

public class DivideByZeroException extends ArithmeticException
{
	public DivideByZeroException()
	{
		super("You cannot divide by zero in this language!");
	}
	
	public DivideByZeroException(String message)
	{
		super(message);
	}
}
