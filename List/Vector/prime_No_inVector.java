/*WAP to store 7 integer values in a Vector and display only the prime numbers.*/

import java.util.*;
public class prime_No_inVector{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the how many elements you want add ");
		int size = sc.nextInt();

		Vector<Integer> v = new Vector<>();

		System.out.print("Enter the Element in vector: ");
		for(int i = 0; i < size; i++){
			int val = sc.nextInt();
			v.add(val);
		}

		Vector<Integer> result = new Vector<>();
		for(int i = 0; i < size; i++){
			int num = v.get(i);
			int count = 0;
			if(num > 1){
				for(int j = 1; j <= num; j++){
					if(num % j == 0){
						count ++;
					}
				}

				if(count == 2){
					result.add(num);
				}
			}
		}
		if(result.size() > 0){
			System.out.print("Display the Result: "+ result);
		}
		else{
			System.out.print("No Prime Number found");
		}
	}
}