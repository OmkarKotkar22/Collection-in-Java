/*Q3.Write a java program to find common elements between two arrays using Map.
Input :- Array1: {1, 2, 3, 4, 5}
 Array2: {3, 4, 5, 6, 7}
Output :- Common Elements: 3 4 5
Description:
Store first array elements in Map. Traverse second array and check manually if element exists.*/

import java.util.*;
public class Arrays_Common_Element_Map{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of first Array: ");
		int n1 = sc.nextInt();

		System.out.print("Enter the size of Second Array: ");
		int n2 = sc.nextInt();

		int a1[] = new int[n1];

		System.out.print("Enter the Elements in First Array : ");
		for(int i = 0; i < a1.length; i++){
			a1[i] = sc.nextInt();
		}

		int a2[] = new int[n2];

		System.out.print("Enter the Elements in Second Array : ");
		for(int i = 0; i < a2.length; i++){
			a2[i] = sc.nextInt();
		}

		Map<Integer, Boolean> map = new HashMap<>();

		for(int i = 0; i < n1; i++){
			map.put(a1[i], true);
		}

		System.out.print("Common Elements: ");
		for(int i = 0; i < n2; i++){
			if(map.containsKey(a2[i])){
				System.out.print(a2[i] +" ");
			}
		}
	}
}