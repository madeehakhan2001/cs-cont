//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListLast
{
	public static boolean go(List<Integer> ray)
	{
		for ( int start = 0; start < ray.size()-1; start ++)
			if ( ray.get(start) == ray.get(ray.size()-1))
				return true;
		return false;
	}
}