import java.util.*;
public class FindingElements{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);

		System.out.print("Enter the Searching Element: ");
		int num = sc.nextInt();
		boolean b = list.contains(num);
		if(b)
			System.out.print("Element Present");
		else
			System.out.print("Element not Present");
	}
}