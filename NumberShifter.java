//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int [] nums = new int [size];
		
		for (int start = 0; start < size; start++)
		{	
			nums[start] = (int)(Math.random()*10)+1;
		}

		return nums;
	}
	public static void shiftEm(int[] array)
	{
		int s = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 7) 
			{
				int swap = array[i];
				array[i]  = array[s];
				array[s] = swap;
				s++;
				
			}
		//System.out.println();
		}
    }
}