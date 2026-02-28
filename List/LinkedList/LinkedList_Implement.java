import java.util.*;
public class LinkedList_Implement{
	public static void main(String x[]){
		LinkedList list = new LinkedList();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.addFirst(50);
		list.addLast(600);
		for(Object obj:list){
			System.out.print(obj + " ");
		}
	}
}