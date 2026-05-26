/*Remove All Elements from Set*/

import java.util.*;
public class Remove_all_Elements{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many records you want to insert: ");
		int n = sc.nextInt();

		Set<Integer> set = new HashSet<>();
		System.out.println("Enter the Elements: ");
		for(int i = 0; i < n; i++){
			set.add(sc.nextInt());
		}

		set.clear();

		System.out.print("Display Set");
		for(int i = 0; i < n; i++){
			System.out.print(set + " ");
		}
	}
}