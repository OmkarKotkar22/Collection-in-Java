/*Q2. Create an ArrayList of integers and calculate the sum of all elements.

	Explanation:
	 This question practices:
Iterating over ArrayList
Performing arithmetic operations
Using get(index) method*/

import java.util.*;
public class Sum_of_All_Elements_AL{
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

		int sum = 0;
		Iterator i = al.iterator();
		while(i.hasNext()){
			int a = (int) i.next();
			sum = sum + a;
		}
		System.out.print(sum);
	}
}