/*Find Sum of Elements in Set*/

import java.util.*;
public class Find_Sum_Element_Set{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Elements you want to add: ");
		int n = sc.nextInt();

		Set<Integer> set = new HashSet<>();
		System.out.println("Enter the Elements");
		for(int i = 0; i < n; i++){
			set.add(sc.nextInt());
		}

		int sum = 0;
		for(int x : set){
			sum = sum + x;
		}

		System.out.print("Sum is : " + sum);
	}
}