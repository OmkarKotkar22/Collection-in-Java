/*Remove Strings Starting With 'a'*/

import java.util.*;
public class remove_char-a-start_Str_ArrayList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "anjir"));
		
		for(int i = 0; i < list.size(); i++){
			String str = list.get(i);
			char ch = str.charAt(i);
			if(ch == 'a'){
				list.remove(i);
				i--;
			}
		}
	}
}