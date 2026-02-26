/*fail_Safe*/

import java.util.*;
//import java.util.concurrent.*;
public class fail_Safe{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter how many elements you want add: ");
		int size = sc.nextInt();

		System.out.print("Enter the Elements : ");
		for(int i = 0; i < size; i++){
			int val = sc.nextInt();
			al.add(val);
		}

		System.out.print("Enter the target index the new value: ");
		int target = sc.nextInt();

		if (!al.isEmpty()) {
    			int value = al.get(target);
    			al.set(target, value * 10);
		}
		
		System.out.print("After : "+ al);
	}
}