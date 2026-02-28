/*WAP to store 10 integers in a Vector and shift all elements to the left by 2 positions.*/

import java.util.*;
public class Rotate_Vector{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Elements you want to add: ");
		int size = sc.nextInt();

		Vector<Integer> v= new Vector<>();

		System.out.print("Enter the Elements: ");
		for(int i = 0; i < size; i++){
			int val = sc.nextInt();
			v.add(val);
		}


		for(int i = 0; i < 2; i++){
			int first = v.remove(0);
			v.add(first);
		}

		System.out.print("Display Rotated Vector: "+ v);
	}
}