import java.util.*;
public class min_Method_collections{
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
		
		Object minValue = Collections.min(list);
		System.out.print("Min Value: "+ minValue);
	}
}