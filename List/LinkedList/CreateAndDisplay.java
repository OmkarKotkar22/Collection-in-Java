/*create and display linkedList*/


import java.util.*;
public class CreateAndDisplay{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter how many element you want to add: ");
		int size= sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();

		System.out.print("Enter the Elements: ");
		for(int i = 0; i < size; i++){
			list.add(sc.nextInt());
		}

		System.out.print("Using simple for loop");
		for(int i = 0; i < size; i++){
			System.out.print(list.get(i)+ " ");
		}

		System.out.print("\nUsing for-each: ");
		for(Integer xy : list){
			System.out.print(xy+" ");
		}

		System.out.print("\nUsing Interator: ");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+ " ");
		}
	}
}