import java.util.*;
public class Max_Element{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);

		int max = Integer.MIN_VALUE;
		for(Integer num : list){
			if(num > max){
				max = num;
			}
		}
		System.out.print("Max Elements: "+ max);
	}
}