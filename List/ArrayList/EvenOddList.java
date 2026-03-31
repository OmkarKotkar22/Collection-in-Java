/*Q2. Store N integers in a List. Separate even and odd numbers into two different lists without
using built-in filtering.
Input:
6
4 7 10 13 2 9
Output:
Even List: 4 10 2
Odd List: 7 13 9
Description:
Use modulus logic and manually add elements into respective lists.
*/

import java.util.*;
public class EvenOddList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the how many elements you want to add:" );
		int n = sc.nextInt();

		List<Integer> al = new ArrayList<>();

		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		
		System.out.print("Enter the Elements: ");
		for(int i= 0; i < n; i++){
			int num  = sc.nextInt();
			al.add(num);

			if(num % 2 == 0){
				even.add(num);
			}
			else{
				odd.add(num);
			}
		}

		System.out.print("Even Number: " + even);
		System.out.print("Odd Number: " + odd);

	}
}