import java.util.*;
public class max_Method_Collections{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();

		System.out.print("Adding Elements : ");

		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
		Object maxValue = Collections.max(list);
		System.out.print("Max Elements: "+ maxValue);
	}
}