/*Q5. Write a Java program that takes a string and stores each character with its frequency using
a Map.
Input
String: "programming"
Output : p → 1 r → 2 o → 1 g → 2 a → 1 m → 2 i → 1 n → 1
Description:
Do not use any inbuilt string methods for counting. Traverse character by character and update
the map manually.
*/

import java.util.*;
public class Count_Char_Freq_Using_Map{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String s = sc.next();

		Map<Character, Integer> map = new LinkedHashMap<>();

		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);

			if(map.containsKey(ch)){
				map.put(ch, map.get(ch) + 1);
			}
			else{
				map.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			System.out.print(entry.getKey() + "=" + entry.getValue() + " ");
		}
	}
}