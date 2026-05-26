/*Remove Duplicate Strings*/

import java.util.*;
public class Remove_Duplicate_Strings_ArrayList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to add: ");
		int n = sc.nextInt();

		List<String> list = new ArrayList<>();

		System.out.print("Enter the Elements");
		for(int i = 0; i < n; i++){
			list.add(sc.next());
		}

		Set<String> set = new HashSet<>(list);
		System.out.print(set + " ");
	}
}