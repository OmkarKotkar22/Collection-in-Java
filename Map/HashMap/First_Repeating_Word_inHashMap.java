/*Q8. Write a java program to find the first repeating word in a sentence.
Input
Sentence: "this is a test this is simple"
Output
First Repeating Word: this
Description :
Manually extract words without split(). Store words in HashMap and find the first word whose
frequency*/

import java.util.*;
public class First_Repeating_Word_inHashMap{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sentence: ");
		String s = sc.nextLine();

		Map<String, Integer> map = new HashMap<>();
		
		String word = "";
		boolean found = false;
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			if(ch != ' '){
				word += ch;
			}
			else {
				if(map.containsKey(word)){
		                    System.out.println("First Repeating Word: " + word);
					found = true;
					break;
				}
				else{
					map.put(word, 1);
				}
				word = "";
			}
		}

		if(!found) {
            		if(map.containsKey(word)) {
                		System.out.println("First Repeating Word: " + word);
                		found = true;
            		}
        	}

        	if(!found) {
            		System.out.println("No repeating word found");
        	}
	}
}