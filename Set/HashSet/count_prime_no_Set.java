/*Count Prime Numbers in Set*/

import java.util.*;
public class count_prime_no_Set{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Elements you want to add: ");
		int n = sc.nextInt();

		Set<Integer> set = new HashSet<>();
		System.out.print("Enter the Elements");
		for(int i = 0; i < n; i++){
			set.add(sc.nextInt());
		}

		int count = 0;
		for(int y : set)
			if(isPrime(y))
				count++;

		System.out.print("Prime Number Count: "+ count);

	}

	public static boolean isPrime(int n){
		if(n <= 1)
			return false;

		for(int i = 2 i < n; i++)
			if(n % i == 0)
				return false;
		return true;
	}
}