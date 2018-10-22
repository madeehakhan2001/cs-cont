//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int total = 0;
		for (int s = 0; s < ray.length; s++) {
			if (ray[s] > ray[ray.length-1])
			{
				total += ray[s];	
			}
			else
				total += 0;
			
		}
		if (total <= 0)
			total = -1;
		return total;
	}
}