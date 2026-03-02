import java.util.*;
public class store_Elements_inTreeSet{
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
	}
}