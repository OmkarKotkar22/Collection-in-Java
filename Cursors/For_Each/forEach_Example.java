/* simple by using for Each*/

import java.util.*;
public class forEach_Example{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of Vector: ");
		int size = sc.nextInt();

		Vector<Integer> v = new Vector<>();
		System.out.print("Enter the Elements: ");
		for(int i = 0; i < size; i++){
			int value = sc.nextInt();
			v.add(value);
		}
		Collections.sort(v);
		System.out.print("Display Elements: \n");
		for(Object o:v){
			System.out.print(o+ " ");
		}
	}
}