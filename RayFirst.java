//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayFirst
{
	public static boolean go(int[] ray)
	{
		boolean notTrue = false;
		
		for ( int s = 1; s < ray.length; s++)
			if (ray[s] == ray[0])
				return true;
				
		return notTrue;
	}
}