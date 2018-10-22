//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayGetFirst
{
	
	public static int[] go(int[] ray)
	{
		int [] nums = new int [ray.length-1];
		int start = 0;
		int total = 0;
		int begin = 0; 
		for ( int location = 1; location < ray.length; location++)
		{
			if (ray[location] > ray[0])
			{
				nums[start] = ray[location];
			}
			start++;
		}	
		for (int zeros = 0; zeros < nums.length; zeros ++)
		{	if (nums[zeros] == 0)
				total++;
		}
		nums = new int [ ray.length - (total+1) ] ;
		
		for ( int rand = 1; rand <= nums.length; rand++)
		{
			if (ray[rand] > ray[0])
			{
				nums[begin] = ray[rand];
			}
			begin ++;
		}	
		
		return nums;
	}
}
