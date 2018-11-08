//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxesRunner
{
	public static void main( String args[] )
	{		
		 LetterBoxesRunner instance = new LetterBoxesRunner();

			Scanner scan = new Scanner(System.in);
			char c;
			do {
				System.out.println("Enter the letter for the box :: ");
				char letter = scan.next().charAt(0);
				System.out.println("Enter the size of the box :: ");
				int size = scan.nextInt();
				LetterBoxes.printBox(letter, size);
				System.out.println();
				System.out.println("Do you want to enter more input? ");
				c = scan.next().charAt(0);
			
			} while (c == 'Y' || c == 'y');
	}
}