/*PutAll Element in Hashmap*/

import java.util.*;
public class putAll_method_HashMap{
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

		Map<Integer, String> newMap = new LinkedHashMap<>();
		newMap.putAll(map);

		for(Map.Entry<Integer, String> entry : newMap.entrySet()){
			System.out.println(newMap);
		}
	}
}