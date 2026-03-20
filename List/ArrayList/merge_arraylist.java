/*Q9. Create two ArrayLists of integers and merge them into a single ArrayList.*/

import java.util.*;
public class merge_arraylist{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();

		System.out.print("Enter the Elements in First Arraylist: ");
		for(int i = 0; i< 5; i++){
			al1.add(sc.nextInt));
		}
		
		System.out.print("Enter the Elements in Second Arraylist: ");
		for(int i = 0; i< 5; i++){
			al2.add(sc.nextInt));
		}
		
		Arraylist<Integer> result = new ArrayList<>();

		result.addAll(al1);
		result.addAll(al2);

		System.out.print("Result ArrayList: "+ result);
	}
}