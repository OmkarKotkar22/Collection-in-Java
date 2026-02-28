/*Remove a Number from linkedList*/


import java.util.*;
public class removing_Element_in_LinkedList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		System.out.println("Enter how many elements you want to add:");
		int size = sc.nextInt();
		
		System.out.println("Enter the Elements: ");
		for(int i = 0; i < size; i++){
			list.add(sc.nextInt());
		}

		System.out.print("Enter the which entry you want to remove: ");
		int value = sc.nextInt();

		list.remove(Integer.valueOf(value));
		System.out.println("Updated LinkedList: "+ list);		
	}
}
