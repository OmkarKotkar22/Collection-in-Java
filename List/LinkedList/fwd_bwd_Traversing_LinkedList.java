/*Traversing linkedList forward and backward*/

import java.util.*;
public class fwd_bwd_Traversing_LinkedList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to add: ");
		int size = sc.nextInt();

		LinkedList<Integer> list = new LinkedList<>();
	
		System.out.println("Enter the Elements : ");
		for(int i = 0; i < size; i++){
			list.add(sc.nextInt());
		}

		System.out.print("Forward Traversing the LinkedList: ");
		for(Integer num:list){
			System.out.print(num + " ");
		}

		System.out.print("\nBackward Traversing the LinkedList: ");
		ListIterator<Integer> itr = list.listIterator(size);
		while(itr.hasPrevious()){
				System.out.print(itr.previous()+ " ");
		}
	}
}