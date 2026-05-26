/*Q4. Create an ArrayList and find the minimum element.
Explanation:
 Similar to max logic, this improves:
Conditional checking
Traversal logic
*/

import java.util.*;
public class Min_Element_in_AL{
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

		int min = Integer.MAX_VALUE;
		for(Object obj : al){
			if(min > (int)obj){
				min = (int)obj;
			}
		}

		System.out.print("Display Minimum Element: "+ min);
	}
}