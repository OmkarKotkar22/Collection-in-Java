import java.util.*;
public class reverse_Method_collections{
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
		
		System.out.print("Before Reverse: "+ list);
		Collections.reverse(list);
		System.out.print("\n After Reverse: "+ list);
	}
}