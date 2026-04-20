/*Q6. Store multiple words in an ArrayList. Find the longest word without using compareTo().
Input:
[cat, elephant, dog, tiger]
Output:
elephant
Description:
Compare word lengths manually.*/

import java.util.*;
public class Longest_String_inArrayList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the How Words You want to add: ");
		int n = sc.nextInt();
		
		List<String> list = new ArrayList<>();

		System.out.print("Enter the Words: ");
		for(int i = 0; i < n; i++){
			String s = sc.next();
			list.add(s);
		}

		String longest = list.get(0);
		
		for(int i = 0; i < n; i++){
			if(list.get(i).length() > longest.length()){
				longest = list.get(i);
			}
		}

		System.out.print("Longest Word inArrayList:"+ longest);
	}
}