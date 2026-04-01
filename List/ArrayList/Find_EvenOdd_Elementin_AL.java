/*Q5. Store numbers in an ArrayList and count how many are even and how many are odd.
Explanation:
 This helps practice:
Modulus operator %
Condition-based counting
Iteration over collections
*/

import java.util.*;
public class Find_EvenOdd_Elementin_AL{
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
		int evenCount = 0;
		int oddCount = 0;
		for(Object obj : al){
			if((int)obj % 2 == 0){
				evenCount++;		
			}
			if((int)obj % 2 != 0){
				oddCount++;
			}
		}	
		System.out.print("Even Element Count: "+ evenCount +"\n" + "Odd Element Count: "+ oddCount + "\n");	
	}
}