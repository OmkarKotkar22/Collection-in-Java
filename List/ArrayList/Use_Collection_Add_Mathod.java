import java.util.*;
public class Use_Collection_Add_Mathod_AL{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();

		System.out.print("Enter the how many Elements you want: ");
		int n = sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			al.add(value);
		}
	}
}