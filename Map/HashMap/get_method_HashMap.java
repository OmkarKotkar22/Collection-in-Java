/*Get Element in Hashmap*/

import java.util.*;
public class get_method_HashMap{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Element you want to add: ");
		int n = sc.nextInt();

		Map<Integer, String> map = new HashMap<>();
		System.out.println("Enter the Elements");
		for(int i = 0; i < n; i++){
			System.out.print("Enter the Key: ");
			int key = sc.nextInt();
			
			System.out.print("\nEnter the Value: ");
			String value = sc.next();

			map.put(key, value);
		}

		System.out.print("Enter the Searching key: ");
		int k = sc.nextInt();
		Object o = map.get(k);
		if(o != null){
			System.out.print(o);
		}
		else{
			System.out.print("Not null");
		}
	}
}