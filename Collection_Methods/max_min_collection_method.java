/*Q7. Write a Java program to find the largest and smallest number from an ArrayList of integers.
Explanation:
 Use Collections.max(list) and Collections.min(list) for quick implementation.
*/

import java.util.*;
public class max_min_collection_method{
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

		//Collections.max(al);
		//Collections.min(al);
		System.out.print("Inbuilt method \n Display: Maximum Element: "+ Collections.max(al) + " " + "\nDisplay: Minimum Element: "+ Collections.min(al));

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < al.size(); i++){
			if(max < al.get(i)){
				max = al.get(i);
			}
			if(min > al.get(i)){
				min = al.get(i);
			}
		}
		System.out.print("\n\nManual Logic \n Display: Maximum Element: "+ max + " " + "\nDisplay: Minimum Element: "+ min);

		
	}
}