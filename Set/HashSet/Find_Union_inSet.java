/*Find Union of Two Sets*/

import java.util.*;
public class Find_Union_inSet{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the how many Elements you want to add in First Set : ");
		int n1 = sc.nextInt();

		Set<Integer> set1 = new HashSet<>();
		for(int i = 0; i < n1; i++){
			set1.add(sc.nextInt());
		}

		System.out.print("Enter the how many Elements you want to add in second Set : ");
		int n2 = sc.nextInt();

		Set<Integer> set2 = new HashSet<>();
		for(int i = 0; i < n2; i++){
			set2.add(sc.nextInt());
		}

		set1.addAll(set2);

		System.out.print("Common Elements: "+ set1);
	}
}