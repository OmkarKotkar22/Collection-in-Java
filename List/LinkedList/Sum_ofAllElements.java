import java.util.*;
public class Sum_ofAllElements{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);

		int sum = 0;
		for(Integer num : list){
			sum = sum + num;
		}
		System.out.print("Sum of All Elements: "+ sum);
	}
}