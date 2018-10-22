import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int odd = 0; 
		int even = 0;
		int total = 0;
		
		for (int num = 0; num < ray.length; num++)
		{
			if ((double)(ray[num] % 2) != 0)
			{
				odd = num;
				
				for (int num2 = num; num2 < ray.length; num2 ++)
				{
				if (ray[num2] % 2 == 0)
				{	even = num2;
					break;
				}	
				else
					total = 0;
				}
				
				total = even - odd;
				break;
			}
		}
		if (total == 0)
				total = -1;
		return total;
	}
}