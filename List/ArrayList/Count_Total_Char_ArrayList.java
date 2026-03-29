/*Count Total Characters*/

import java.util.*;
public class Count_Total_Char_ArrayList{
	public static void main(String x[]){
		List<String> list = new ArrayList<>(Arrays.asList("java", "code", "Collection"));

		int total = 0;
		for(String s : list){
			total += s.length();
		}

		System.out.print("Total Char: "+ total);
	}
}