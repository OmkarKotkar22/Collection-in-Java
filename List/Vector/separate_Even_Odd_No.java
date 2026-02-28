/*WAP to store 15 integer values in a Vector and separate even and odd numbers into two different Vectors.*/

import java.util.*;
public class separate_Even_Odd_No{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want insert: ");
		int size = sc.nextInt();

		Vector<Integer> v = new Vector<>();
	
		System.out.print("Enter the Elements: ");
		for(int i = 0; i < size; i++){
			int val = sc.nextInt();
			v.add(val);
		}

		Vector<Integer> even = new Vector<>();
		Vector<Integer> odd = new Vector<>();

		for(int i = 0; i < size; i++){
			if(v.get(i) % 2 == 0){
				even.add(v.get(i));
			}
			else{
				odd.add(v.get(i));
			}
		}
		
		System.out.print("Display Even Elements: "+ even);
		System.out.print("\nDisplay Odd Elements: "+ odd);
	}
}