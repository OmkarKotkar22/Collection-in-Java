/*Remove Common Elements Between Two Sets*/

import java.util.*;
public class Remove_common_Elements_2Set{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Elements you want to add 1st Set: ");		
		int n1 = sc.nextInt();

		Set<Integer> set1 = new HashSet<>();
		System.out.print("Enter the Elements");
		for(int i = 0; i < n1; i++){
			set1.add(sc.nextInt());
		}

		System.out.print("Enter how many Elements you want to add 2nd Set: ");		
		int n2 = sc.nextInt();

		Set<Integer> set2 = new HashSet<>();
		System.out.print("Enter the Elements");
		for(int i = 0; i < n2; i++){
			set2.add(sc.nextInt());
		}

		set1.removeAll(set2);
		System.out.print(set1+ " ");
	}
}