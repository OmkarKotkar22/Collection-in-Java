import java.util.*;
public class Insert_Element_inSpecific_index{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		LinkedList <Integer> list = new LinkedList<>();

		list.add(100);
		list.add(300);
		list.add(500);
		list.add(600);
		list.add(700);
		list.add(800);

		System.out.print("Enter the Position to Index");
		int pos = sc.nextInt();

		System.out.print("Enter the Value to Index");
		int val = sc.nextInt();

		list.add(pos, val);
		System.out.print("Display the LinkedList Elements: "+ list);
	}
}