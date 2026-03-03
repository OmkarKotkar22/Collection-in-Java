import java.util.*;
public class addMethod_Collections{
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
		
		System.out.print("Adding Elements: ");
		for(Integer num : list){
			System.out.print(num +" ");
		}
	}
}