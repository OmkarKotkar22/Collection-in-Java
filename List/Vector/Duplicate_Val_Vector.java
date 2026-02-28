/*WAP to store 10 values in Vector and find duplicated values*/

import java.util.*;
public class Duplicate_Val_Vector{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to add: ");	
		int size = sc.nextInt();
	
		Vector<Integer> v = new Vector<>();
		System.out.print("Enter the elements in Vector: ");
		for(int i= 0; i < size; i++){
			int value = sc.nextInt();
			v.add(value);
		}
		
		for(int i = 0; i < v.size() -1; i++){
			for(int j = 0; j < v.size()-1-i; j++){
				if(v.get(j) > v.get(j+1)){
					int temp = v.get(j);
					v.set(j, v.get(j+1));
					v.set(j+1, temp);	
				}
			}
		}

		int count = 1;
		for(int i = 1; i < size; i++){
			
			if(v.get(i).equals(v.get(i-1))){
				count++;
			}

			else{
				if(count > 1){
					System.out.print(v.get(i-1));
				}
				count = 1;
			}
		}
		if(count > 1){
			System.out.print("Duplicate Values are : "+ v.get(v.size()-1)+", ");
		}
	}
}