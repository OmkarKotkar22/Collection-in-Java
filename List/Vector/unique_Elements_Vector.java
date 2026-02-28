/*WAP to store 10 integers in a Vector and check whether all elements are unique.*/

import java.util.*;
public class unique_Elements_Vector{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the how many elements you want to Add: ");
		int size = sc.nextInt();

		Vector<Integer> v = new Vector<>();

		System.out.println("Enter the Elements: ");
		for(int i = 0; i < size; i++){
			int val = sc.nextInt();
			v.add(val);
		}

		Collections.sort(v);

		Vector<Integer> result = new Vector<>();

		for(int i = 0; i < v.size(); i++){
				if(!result.contains(v.get(i))){
					result.add(v.get(i));
				}
		}

		for(int i = 0; i < result.size(); i++){
			System.out.print(result.get(i) + " ");
		}
	}
}