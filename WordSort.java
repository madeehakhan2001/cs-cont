//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
	   setList(line);
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		Arrays.sort(wordRay);
		
	}

	public String toString( )
	{
		int num;
		String output="";
		for (num = 0; num < wordRay.length; num++)
		{
			output =  wordRay[num];
			System.out.println("word " + num + " :: " + output);
		}
		return "";
	}
}