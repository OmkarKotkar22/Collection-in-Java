import java.util.*;
public class shuffle_method_collections{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the how many elements you want to add: ");
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		System.out.print("Enter the Elements: ");
		for(int i =0; i < n; i++){
			list.add(sc.nextInt());
		}

		System.out.print("Before Shuffle: "+ list);
		Collections.shuffle(list);
		System.out.print("After Shuffle: "+ list);
	}
}