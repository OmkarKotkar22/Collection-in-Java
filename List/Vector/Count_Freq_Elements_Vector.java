/*WAP to store 12 numbers in a Vector and display the frequency of each number.*/

import java.util.*;
public class Count_Freq_Elements_Vector{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Elements you want to add: ");
		int size = sc.nextInt();

		Vector<Integer> v= new Vector<>();

		System.out.print("Enter the Elements: ");
		for(int i = 0; i < size; i++){
			int val = sc.nextInt();
			v.add(val);
		}

		Vector<Boolean> visited = new Vector<>();
		for(int i = 0; i < size; i++){
			visited.add(false);
		}
		for(int i =0; i<size; i++){
			if(vis)
			int count = 1;
			for(int j = i+1; j < size; i++){
				if(v.get(i).equals(v.get(j))){
					count++;
					visited.set(j, true);
				}
			}

			System.out.print(v.get(i)+"occur"+count+"times");
		}
	}
}