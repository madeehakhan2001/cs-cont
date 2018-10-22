//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		for (int num = 0; num<number; count++)
		{
			number/=10;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] Sorted = new int [NumberSorter.getNumDigits(number)];
		for (int num2 = 0; num2<Sorted.length; num2++)
		{
			Sorted[num2] = number%10;
			if (number > 0) 
			{
				number/=10;
			}
		}
		Arrays.sort(Sorted);
		return Sorted;
	}
}