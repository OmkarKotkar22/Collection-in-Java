/*Check If Element Exists in Set*/


import java.util.*;
public class Check_Element_Exists_inSet{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Elements you want to add: ");
		int n = sc.nextInt();

		Set<Integer> set = new HashSet<>();
		System.out.println("Enter the Elements : ");
		for(int i = 0; i < n; i++){
			set.add(sc.nextInt());
		}

		System.out.print("Enter the Searching Key: ");
		int skey = sc.nextInt();

		if(set.contains(skey)){
			System.out.print(skey + " : Key Found");
		}
		else{
			System.out.print(skey + " : Key Not Found");
		}
	}
}