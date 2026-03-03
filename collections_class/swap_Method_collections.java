import java.util.*;
public class swap_Method_collections{
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
		
		System.out.print("Before Swapping: "+list);
		Collections.swap(list, 1, 4);
		System.out.print("\n After Swapping: "+ list);
	}
}