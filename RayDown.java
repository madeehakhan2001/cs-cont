import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		for (int num = 0; (num < numArray.length && num+1< numArray.length); num ++)
			if (numArray[num] > numArray[num+1])
				return true;
			else 
				return false;
		return false;
	}	
	
}