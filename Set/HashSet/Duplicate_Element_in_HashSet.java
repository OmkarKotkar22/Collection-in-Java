/*Find Duplicate Elements from Array Using Set*/

import java.util.*;
public class Duplicate_Element_in_HashSet{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Elements you want to insert: ");
		int n = sc.nextInt();

		Set<Integer> set = new Hashset<>();
		Set<Integer> duplicate = new HashSet<>();

		System.out.print("Enter the Elements: ");
		for(int i = 0; i < n; i++){
			int val = sc.nextInt();
			if(!set.add(val))
				duplicate.add(val);
		}
	
		System.out.print("Display Duplicate Elements: " + duplicate);
		
	}
}