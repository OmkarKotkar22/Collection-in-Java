/*fail fast*/

import java.util.*;
public class fail_Fast{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want : ");
		int size = sc.nextInt();

		Vector<Integer> v = new Vector<>();

		System.out.print("Enter the Elements in vector: ");
		for(int i  = 0; i < size; i++){
			int value = sc.nextInt();
			v.add(value);
		}

		Iterator i = v.iterator();
		while(i.hasNext()){
			Object obj = i.next();
			if((int)obj == 20){
				v.add(100);
			}
		}
		System.out.print(v);
	}
}