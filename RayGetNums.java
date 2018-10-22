import java.util.Arrays;


public class RayGetNums
{

	public static String go(int[] ray)
	{
		
		int first = 0;
		int second = 0;
		int third = 0;
		int callNum = 0;
		int callNum2 = 0;
		for (int num = 0; num < ray.length; num++)
		{
			if (ray[num] > 11)
			{	first = ray[num];
				callNum = num;
				break;
			}
			else
				first = 0;
		}
		for (int num2 = callNum+1 ; num2 < ray.length; num2++)
		{
			if (ray[num2] > 11)
			{
				second = ray[num2];
				callNum2 = num2;
				break;
			}
			else
				second = 0;
		}
		for (int num3 = callNum2+1; num3 < ray.length; num3++)
		{
			if(ray[num3] > 11)
			{
				ray[num3] = third ;
				break;
			}
			else
				third = 0;
		}
		
		return ("[" + first + ", " + second + ", " + third + "]");
	}
}
