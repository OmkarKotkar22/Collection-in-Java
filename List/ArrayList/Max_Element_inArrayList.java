/*Q3. Write a program to find the maximum value from an integer ArrayList.
Explanation:
 You will learn:
How to compare elements
Store maximum value manually
Logical thinking without built-in methods
*/

import java.util.*;
public class Max_Element_in_AL{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();

		System.out.print("Enter the how many Elements you want: ");
		int n = sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			al.add(value);
			
		}

		int max = Integer.MIN_VALUE;
		for(Object obj : al){
			if(max < (int)obj){
				max = (int)obj;
			}
		}
		System.out.print("Maximum ELement is: "+ max);
	}
}