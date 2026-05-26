import java.util.*;
public class Rotate_ArrayList_by_k{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the how many elements you want to add: ");
		int n = sc.nextInt();
	
		List<Integer> list = new ArrayList<>();

		System.out.print("Enter Elements : ");
		for(int i  = 0; i < n; i++){
			int num = sc.nextInt();
			list.add(num);
		}

		System.out.print("Enter the k position: ");
		int k = sc.nextInt();
 
		List<Integer> rotated = new ArrayList<>();
		for(int i=k; i <n;i++){
			rotated.add(list.get(i));
		}
		for(int i = 0; i < k; i++){
			rotated.add(list.get(i));
		}

		System.out.print("Rotated List: "+ rotated);
	}
}