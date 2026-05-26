/*Sort Strings by Length*/

import java.util.*;
public class Sort_String_by_len_ArrayList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Elements you want to add: ");
		int n = sc.nextInt();

		List<String> list = new ArrayList<>();
		
		System.out.println("Enter the Elements");
		for(int i = 0; i < n; i++){
			list.add(sc.next());
		}

        list.sort((a,b) -> a.length() - b.length()); 
        
// 		Collections.sort(list, new Comparator<String>(){
// 			public  int compare(String a, String b){
// 				return a.length() - b.length();
// 			}
// 		});

		System.out.println(list);

	}
}