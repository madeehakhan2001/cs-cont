//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*; 

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);

		for(int i=0; i<size;i++)
		{
			//read in monster values 
			System.out.println("enter monster height");
			 size= keyboard.nextInt();
			System.out.println("enter how many monsters");
			int spot= keyboard.nextInt();
			
			Monsters m= new Monsters(size);
			//ask for ht
			
			
			//ask for wt
			
			//ask for age
	
			//instantiate a new Monster() and add it to the herd			
			
		}		
		
		System.out.println("HERD :: "+herd+"\n");
		//print out the other stats
			
	}		
}