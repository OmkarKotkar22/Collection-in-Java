/*Q9. Write a program using ArrayListto store exam marks ofstudents. Take a numberfrom the user
and count how many times it appears in the list.
Explanation:
• Store marksin an ArrayList.
• Traverse the list using a loop.
• Compare each element with the user input and maintain a count.
• Demonstrates searching and frequency counting using ArrayList.*/


import java.util.*;
public class Appearance_of_number_Arraylist{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to add: ");
		int limit = sc.nextInt();

		ArrayList<Integer> al = new ArrayList<>();

		System.out.print("Enter the Elements in ArrayList: ");
		for(int I = 0; I < limit; I++){
			al.add(sc.nextInt());
		}

		System.out.print("Enter Number You want: ");
		int num = sc.nextInt();

		int count = 0;

		for(int marks : al){
			if(num == marks){
				count++;
			}
		}

		System.out.print(num +" appears "+count+ " times");
	}
}