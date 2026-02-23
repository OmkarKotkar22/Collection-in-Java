/* Basic code using Enumeration Interface*/

import java.util.*;
public class displayElements{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Vector: ");
		int size = sc.nextInt();
		Vector<Integer> v = new Vector<>();

		System.out.print("Enter the Elements: ");
		for(int i = 0; i < size; i++){
			int value = sc.nextInt();
			v.add(value);
		}

		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			Object o = e.nextElement();
			System.out.print(o + " ");
		}
	}
}