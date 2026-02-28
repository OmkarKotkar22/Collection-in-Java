import java.util.*;
public class CountingElements{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);

		int count = 0;
		for(Integer num : list){
			count++;	
		}
		System.out.print("Count Elements: "+ count);
	}
}