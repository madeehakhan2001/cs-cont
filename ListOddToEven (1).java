//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		for ( int start = 0; start < ray.size(); start ++ )
		{
			if ( ray.get(start)%2 > 0 )
			{	for ( int even = ray.size()-1; even > ray.indexOf(start); even -- )
					if ( ray.get(even)%2 == 0 )
				{
					return (ray.lastIndexOf(ray.get(even)) - ray.indexOf(ray.get(start)));
				}
			}		
		}
		return -1;
	}
}