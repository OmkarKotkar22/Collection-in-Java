/*Q6. Write a java program to Check whether a given number exists in an ArrayList.
Explanation:
 You learn:
Linear search logic
Use of flag variable
Comparison using loop
*/

import java.util.*;
public class No_Exist_orNot_AL{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.print("Enter the how many Elements you Want: ");
		int n = sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			al.add(value);
		}

		System.out.print("Enter the Searching Element: ");
		int no = sc.nextInt();

		boolean flag = false;
		for(Object obj : al){
			if((int)obj == no){
				flag = true;
				break;
			}
		}

		if(flag){
			System.out.print("Number is Exist");
		}
		else{
			System.out.print("Number is not Exist");
		}
	}
}