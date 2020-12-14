package edu.greenriver.it.exceptions;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class TryWith
{
	public static void main(String[] args)
	{
		openFile("test.txt");
	}
	
	public static void openFile(String fileName)
	{
		File myFile = new File(fileName);
		
		try (Scanner fileReader = new Scanner(myFile))
		{
			while(fileReader.hasNext())
			{
				String token = fileReader.next();
				System.out.println(token);
			}			
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}		
	}
}
















