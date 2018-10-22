//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int total = 0;
		if (ray.size() == 1)
			return Integer.MIN_VALUE;
		
		for (int num = 0; num < ray.size(); num++) 
		{	if (ray.get(num) > ray.get(0))
			{
				total += ray.get(num);
			
			}
		}
		if (total == 0)
			total = Integer.MIN_VALUE;
		return total;
	}
}