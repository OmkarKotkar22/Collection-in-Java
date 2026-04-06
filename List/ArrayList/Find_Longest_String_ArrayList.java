/*Find Longest String*/

import java.util.*;
public class Find_Longest_String_ArrayList{
	public static void main(String x[]){
/*		List<String> list = Arrays.asList("apple", "banana", "kiwi");
        	String longest = "";
        	for(String s : list){
            		if(s.length() > longest.length()){
            			longest = s;
            		}
        	}
        
		System.out.print(longest);
*/
		Scanner sc = new Scanner(System.in);
		System.out.print("how many Elements you want to add: ");
		int n =sc.nextInt();

		List<String> list = new ArrayList<>();
		System.out.println("Enter the Elements");
		for(int i = 0; i < n; i++){
			list.add(sc.next());
		}
        	String longest = "";
        	for(String s : list){
            		if(s.length() > longest.length()){
            			longest = s;
            		}
        	}

	}
}
