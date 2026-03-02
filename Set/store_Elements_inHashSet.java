import java.util.*;
public class store_Elements_inHashSet{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		HashSet hs = new HashSet();

		System.out.print("Enter Elements:");
		hs.add(sc.nextInt());
		hs.add(sc.nextInt());
		hs.add(sc.nextInt());
		hs.add(sc.nextInt());
		hs.add(sc.nextInt());
		hs.add(sc.nextInt());
		hs.add(sc.nextInt());
		hs.add(sc.nextInt());

		System.out.print("Display Elements: ");
		for(Object obj: hs){
			System.out.print(obj+" ");
		}
	}
}