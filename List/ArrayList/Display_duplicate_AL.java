/*Q10. Write a java program to Identify and display duplicate numbers in an integer ArrayList.
Explanation:
 This helps you understand:
Nested loops
Comparison logic
Handling repeated values
*/

import java.util.*;
public class Display_duplicate_AL{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();

		System.out.print("Enter the how many element you want in Array list: ");
		int n = sc.nextInt();

		System.out.print("Enter Element: ");
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			al.add(value);
		}

		System.out.print("[" );
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(al.get(i).equals(al.get(j)))
				{
					System.out.print( al.get(i) + ", ");
					break;
				}
			}
		}
				System.out.print("]");
	}
}
