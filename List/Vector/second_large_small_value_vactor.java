/*WAP to store 15 integers in a Vector and find the second largest and second smallest values.*/

import java.util.*;
public class second_large_small_value_vactor{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to add: ");
		int size = sc.nextInt();

		Vector<Integer> v = new Vector<>();

		System.out.println("Enter the elements: ");
		for(int i = 0; i < size; i++){
			int val = sc.nextInt();
			v.add(val);
		}

		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;

		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;

		for(int i = 0; i < size; i++){
			int val = v.get(i);

			if(max < val){
				smax = max;
				max = val;
			}
			else if(val < max && smax > val){
				smax = val;
			}

			if(min > val){
				smin = min;
				min = val;
			}
			else if(val < min && smin > val){
				smin = val;
			}
		}
		System.out.print("Second Maximum "+ smax);
		System.out.print("Second Minimum " + smin);
		
	}
}