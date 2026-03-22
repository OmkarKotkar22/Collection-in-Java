/*Count Frequency of Each Word*/

import java.util.*;
public class Count_Freq_Each_word_ArrayList{
	public static void main(String x[]){
		Scanner sc = new  Scanner(System.in);
		System.out.print("Enter how many Elements you want to add: ");
		int n = sc.nextInt();

		List<String> list = new ArrayList<>();

		System.out.println("Enter the Elements : ");
		for(int i = 0; i < n; i++){
			list.add(sc.next());
		}

		Map<String, Integer> map = new HashMap<>();
		
		for(String s: list){
			map.put(s,map.getOrDefault(s,0)+1);
		}

		System.out.println(map);
	}
}