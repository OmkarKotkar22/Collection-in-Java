import java.util.*;
public class InsertingElementsat_First{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);

		list.addFirst(50);
		System.out.print("Inserting Elements: "+ list);
	}
}