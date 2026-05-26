/*Q7. Store words in an ArrayList. Print pairs of words that are anagrams without using sort().
Input:
[listen, silent, cat, act, dog]
Output:
listen - silent
cat - act
Description:
Compare character frequencies of two words manually*/
/*
import java.util.*;
public class Pairs_Anagram_inArrayList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Words you want to add: ");
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		System.out.print("Enter the Words: ");
		for(int i = 0; i< n; i++){
			String s = sc.next();
			list.add(s);
		}
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){	
				String s1 = list.get(i);
				String s2 = list.get(j);
				if(s1.length() != s2.length()){
					continue;
				}
				int freq[] = new int[256];
				for(int k = 0; k < s1.length(); k++){
					freq[s1.charAt(k)]++;
					freq[s2.charAt(k)]--;
				}
				boolean flag = false;
				for(int k = 0; k < 256; k++){
					if(freq[k] != 0){
						flag = true;
					}
				}
				System.out.println("Anagrams:");
				if(!flag){
					System.out.print(s1 + " - " + s2 + "\n");
				}
			}
		}
	}
}*/
