/*Q8. Write a Java program to remove duplicate elements from an ArrayList of strings.*/

import java.util.*;
public class remove_Duplicate_fromArrayList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();

		System.out.print("Enter the Elements: ");
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());

		ArrayList<String> result = new ArrayList<>();
		for(int i = 0; i < al.size(); i++){
			if(!result.contains(al.get(i))){
				result.add(al.get(i));
			}
		}

		System.out.print("After removing Duplicate: "+ result);
	}
}