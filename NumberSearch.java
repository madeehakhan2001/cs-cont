//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		
		Arrays.sort(numArray);
		
		int num = Arrays.binarySearch(numArray, searchNum);
		if ( num < 0)
			num = num*-1;  
		if (numArray[num] > searchNum)
			num = num-1;
		
		return numArray[num];
	}
}