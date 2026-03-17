/*Q9. Write a java program to Copy all elements from one integer ArrayList to another.
Explanation:
 This practices:
Working with multiple ArrayList objects
Element-by-element copying
*/

import java.util.*;
public class Copy_one_to_other_AL{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		System.out.print("Enter the how many Elements you Want: ");
		int n = sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			al1.add(value);
		}

		System.out.print("Before Copy Element: "+ al1 + "\n");
		System.out.print("Before copy Element: "+ al2);

		for(Object obj : al1){
			al2.add(al1);
		}

		System.out.print("After Copy Element: "+ al1 + "\n");
		System.out.print("After copy Element: "+ al2);

	}
}