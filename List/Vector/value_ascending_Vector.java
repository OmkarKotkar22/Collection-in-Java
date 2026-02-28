/*WAP to store 5 values in Vector and arrange in ascending without using sort() methods of Collections */

import java.util.*;
public class value_ascending_Vector{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to add: ");
		int size = sc.nextInt();

		Vector<Integer> v = new Vector<>();
		System.out.print("Enter the Elements in Vector: ");
		for(int i =0; i < size; i++){
			int value = sc.nextInt();
			v.add(value);
		}
		
		for(int i = 0; i < v.size() -1; i++){
			for(int j = 0; j < v.size()-1-i; j++){
				if(v.get(j) > v.get(j+1)){
					int temp = v.get(j);
					v.set(j, v.get(j+1));
					v.set(j+1, temp);	
				}
			}
		}

		System.out.print("Display vector after sorting"+ v);
		
	}
}