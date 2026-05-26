import java.util.*;
public class store_Elements_inTreeSet_ueNavigableSet{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		TreeSet hs = new TreeSet();

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

		/*System.out.print("\nBy using Navigable Set: ");
		NavigableSet ns = hs.descendingSet();
		for(Object o:ns){
			System.out.print(o + " ");
		}*/
	}
}