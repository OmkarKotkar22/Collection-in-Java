/*Q8. Write a java program to Reverse an integer ArrayList without using inbuilt reverse method.
Explanation:
 This improves:
Index manipulation
Swapping logic
Understanding list size
*/

import java.util.*;
public class Reverse_AL{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.print("Enter the how many Elements you Want: ");
		int n = sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			al.add(value);
		}
		
		System.out.print("Before Reverse: "+ al +"\n");
		int start = 0;
		int end = al.size() -1;

		while(start < end){
			Object temp = al.get(start);
			al.set(start, al.get(end));
			al.set(end, temp);	

			start++;
			end--;
		}
		
		System.out.print("After Reverse: "+ al);
	}
}