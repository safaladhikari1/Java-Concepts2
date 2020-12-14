package pens;

import java.util.Scanner;

public class PenStore
{
	//constant
	private static final int VIEW_PENS = 1;
	private static final int SEARCH_PENS = 2;
	private static final int QUIT = 3;
	
	private static Scanner keyboard = new Scanner(System.in);
	
	//what pens are in stock
	private static Pen[] pens = {
			new Pen(PenType.BALL_POINT, "fine", "red"),
			new Pen(PenType.ROLLER_BALL, "regular", "white"),
			new Pen(PenType.FOUNTAIN, "thick", "green")				
	};
	
	public static void main(String[] args)
	{				
		System.out.println("Welcome to my Pen Store!");
		viewMenu();
		
	}
	
	public static void viewMenu()
	{	
		while(true)
		{
			System.out.println("1. View pens");
			System.out.println("2. Search pens");
			System.out.println("3. Quit");
			
			int input = keyboard.nextInt();
			keyboard.nextLine(); //clear buffer
			
			if(input == VIEW_PENS)
			{
				viewPens();
			}	
			else if(input == SEARCH_PENS)
			{
				searchPens();
			}
			else if(input == QUIT)
			{
				break;
			}
		}		
	}
	
	//method for view pens	
	public static void viewPens()
	{
		//print out all the pens
		for(int i=0; i<pens.length; i++)
		{
			System.out.println(pens[i].toString());
		}
	}
	
	//method for search pens
	public static void searchPens()
	{
		//get a pen type from the user
		System.out.println("Enter a pen type");
		System.out.println("BALL_POINT, ROLLER_BALL, FOUNTAIN");
		
		String userInput = keyboard.nextLine();
		
		PenType penType = PenType.valueOf(userInput);
		
		//highlight the pens if you want
		//if(penType.equals("ball-point"))
		
		//print our search results
		for(int i=0; i<pens.length; i++)
		{
			if(penType.equals(pens[i].getType()))
			{
				System.out.println(pens[i].toString());
			}
		}		
	}	
}


































