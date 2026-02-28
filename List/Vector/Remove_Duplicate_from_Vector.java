/*WAP to store 10 values in Vector and remove duplicated values */

import java.util.*;
public class Remove_Duplicate_from_Vector{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the how many elements you want to add: ");
		int size = sc.nextInt();

		Vector<Integer> v = new Vector<>();
		System.out.print("Enter the elements: ");
		for(int i = 0; i < size; i++){
			int value = sc.nextInt();
			v.add(value);
		}

		for(int i = 0; i < size; i++){
			for(int j = 0; j < size-1-i; j++){
				if(v.get(j) > v.get(j+1)){
					int temp = v.get(j);
					v.set(j, v.get(j+1));
					v.set(j+1, temp);
				}
			}
		}

		Vector<Integer> result = new Vector<>();
		result.add(v.get(0));
		for(int i = 1; i < size; i++){
			if(!v.get(i).equals(v.get(i-1))){
				result.add(v.get(i));
			}
		}

		System.out.print("After Removing duplicate: "+ result);
	}
}

/*
import java.util.*;

public class Remove_Duplicate_from_Vector{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many elements you want to add: ");
        int size = sc.nextInt();

        Vector<Integer> v = new Vector<>();

        System.out.println("Enter elements in Vector:");
        for (int i = 0; i < size; i++) {
            v.add(sc.nextInt());
        }

        // Step 1: Sort Vector manually (Bubble Sort)
        for (int i = 0; i < v.size() - 1; i++) {
            for (int j = 0; j < v.size() - 1 - i; j++) {
                if (v.get(j) > v.get(j + 1)) {
                    int temp = v.get(j);
                    v.set(j, v.get(j + 1));
                    v.set(j + 1, temp);
                }
            }
        }

        // Step 2: Remove duplicates
        Vector<Integer> uniqueVector = new Vector<>();
        uniqueVector.add(v.get(0));

        for (int i = 1; i < v.size(); i++) {
            if (!v.get(i).equals(v.get(i - 1))) {
                uniqueVector.add(v.get(i));
            }
        }

        // Step 3: Display result
        System.out.println("Vector after removing duplicate values:");
        System.out.println(uniqueVector);
    }
}*/
