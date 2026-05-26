/*Find Highest and Lowest Value Using TreeSet*/

import java.util.*;
public class Highest_Lowest_Element_inTreeSet{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Elements you want to insert: ");
		int n = sc.nextInt();

		TreeSet<Integer> set = new TreeSet<>();
		System.out.println("Enter the Elements: ");
		for(int i =0; i < n; i++){
			set.add(sc.nextInt());
		}

		System.out.print("Minimum Element in Set: "+ set.first());
		System.out.print("Maximum Element in Set: "+ set.last());
	}
}