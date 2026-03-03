import java.util.*;
public class synchronizedMap_Method_collections{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Elements: ");
	
		List<Integer> list = new ArrayList<>();

		list.add(sc.nextInt());
		list.add(sc.nextInt());		
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
		List list1 = Collections.synchronizedMap(list);
		System.out.print("Synchronized Method: "+ list);
	}
}