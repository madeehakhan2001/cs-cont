//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxes
{
	//instance variables and constructors could be present, but are not necessary
	
	public static void printBox(char letter, int size)
	{
		for(int i=0; i<size;i++)
			System.out.print(letter );
		
				for(int b=0; b<size;b++)
					System.out.println(letter);
					System.out.println("");
	}
}