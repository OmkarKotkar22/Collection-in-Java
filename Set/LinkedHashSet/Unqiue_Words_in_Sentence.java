/*Count Unique Words in Sentence*/

import java.util.*;
public class Unqiue_Words_in_Sentence{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();

		String []words = str.split(" ");
		Set<String> set = new LinkedHashSet<>();
		for(String w : words){
			set.add(w);
		}

		System.out.print("Unique words "+ set + " Unique words count: " + set.size());
	}
}