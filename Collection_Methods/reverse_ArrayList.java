/*Q6. Store 7 strings in an ArrayList and display them in reverse order.
Explanation:
 Two ways:
Use Collections.reverse(list).


Iterate manually from last index to 0.
*/

import java.util.*;
public class reverse_ArrayList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the Elements: ");
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());
		al.add(sc.nextInt());


		Collections.reverse(al);
		System.out.print("By using inbuilt method: "+ al);


		System.out.print("\nby using manual logic: ");

		for (int i = al.size() - 1; i >= 0; i--) {
            		System.out.println(al.get(i));
        	}
	}
}
