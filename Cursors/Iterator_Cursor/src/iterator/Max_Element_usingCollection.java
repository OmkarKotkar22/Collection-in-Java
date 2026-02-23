/*WAP to create vector and store 5 values in it and find the max value from Vector */

import java.util.*;
public class Max_Element_usingCollection{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size how many elements want to add: ");
		int size = sc.nextInt();

		Vector<Integer> v = new Vector<>();
		System.out.print("Enter the Elements: ");
		for(int i = 0; i < size; i++){
			int n = sc.nextInt();
			v.add(n);
		}

		int max = Integer.MIN_VALUE;
		Iterator i = v.iterator();
		while(i.hasNext()){
			Object o = i.next();
			if((int)o > max){
				max = (int)o;
			}
		}

		System.out.print("Max Value is: "+ max);
	}
}