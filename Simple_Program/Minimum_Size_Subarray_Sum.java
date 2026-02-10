/*7. Minimum Size Subarray Sum
Description:
Find minimal length of a subarray whose sum ≥ target.
Example:
Input: target=7, nums=[2,3,1,2,4,3]
Output: 2*/

import java.util.*;
public class Minimum_Size_Subarray_Sum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of ArrayList: ");
		int size = sc.nextInt();

		ArrayList<Integer> al =  new ArrayList<>();

		System.out.print("Enter the Elements in Arraylist: ");
		for(int i = 0; i < size; i++){
			int value = sc.nextInt();
			al.add(value);
		}

		System.out.print("Enter the Target value: ");
		int target = sc.nextInt();

		int left = 0;
		int min_length = size + 1;
		int sum = 0;
		for(int right = 0; right < size; right++){
			sum = sum + al.get(right);
			while(sum >= target){
				int curr_length = right - left +1;
				if(min_length > curr_length){
					min_length = curr_length;
				}
			sum = sum - al.get(left);
			left++;
			}
		}
		if(min_length == size+1){
			System.out.print("min_length" + 0);
		}
		else{
			System.out.print("min length" + min_length);
		}
	}
}