//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import static java.lang.System.*; 

public class WordSortRunner
{
	public static void main(String args[])
	{
		WordSort a = new WordSort ("abc ABC 12321 fred alexander");
		a.sort();
		System.out.println(a.toString());
		
		WordSort b = new WordSort ("a zebra friendly acrobatics 435 TONER PRinTeR");
		b.sort();
		System.out.println(b.toString());
		
		WordSort c = new WordSort ("b x 4 r s y $");
		c.sort();
		System.out.println(c.toString());
		
		WordSort d = new WordSort ("123 ABC abc 034 dog cat sally sue bob 2a2");
		d.sort();
		System.out.println(d.toString());
		

		
	}
}