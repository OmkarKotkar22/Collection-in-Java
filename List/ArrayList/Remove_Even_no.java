/*Q7. Write a java program to Remove all even numbers from an integer ArrayList.
Explanation:
 This teaches:
Removing elements using remove(index)
Handling shifting of elements after removal
Reverse loop concept
*/

import java.util.*;
public class Remove_Even_no{
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

		Iterator<Integer> it = al.iterator();

		while (it.hasNext()) {
		    int num = it.next();
    		    if (num % 2 == 0) {
        			it.remove();
    			}
		}
		System.out.print("Display After the removing even Element: "+ al);
	}
}