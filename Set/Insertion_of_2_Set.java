/*Find Common Elements Between Two Sets (Intersection)*/

import java.util.*;
public class Insertion_of_2_Set{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
	
		System.out.print("Enter Element in First Set: ");
		s1.add(sc.nextInt());
		s1.add(sc.nextInt());
		s1.add(sc.nextInt());
		s1.add(sc.nextInt());
		s1.add(sc.nextInt());

		System.out.print("Enter Element in Second Set: ");
		s2.add(sc.nextInt());
		s2.add(sc.nextInt());
		s2.add(sc.nextInt());
		s2.add(sc.nextInt());
		s2.add(sc.nextInt());

		s1.retainAll(s2);
		System.out.print("Common Elements: "+ s1);
	}
}