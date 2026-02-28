import java.util.*;
public class List_Methods{

/*
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

		System.out.print("Enter index from which index value you want: ");
		int index = sc.nextInt();
		Object obj = al.get(index);
		System.out.print("Getting value form index: "+ obj);
	}
*/

/*
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		
		System.out.print("Enter the how many elements you want: ");
		int n =sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			al.add(value);
		}

		System.out.print("Enter the index from which index value you want to replace: ");
		int index = sc.nextInt();

		System.out.print("Enter the Value: ");
		int val = sc.nextInt();

		Object o = al.set(index, val);
		System.out.print("Display : "+ al);
	}

*/

/*
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		
		System.out.print("Enter the how many elements you want: ");
		int n =sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			al.add(value);
		}

		System.out.print("Enter the index where you want to add value: ");
		int index = sc.nextInt();

		System.out.print("Enter the Value: ");
		int val = sc.nextInt();

		al.add(index, val);
		System.out.print("Display: "+ al);
	}
*/

/*
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		
		System.out.print("Enter the how many elements you want: ");
		int n =sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			al.add(value);
		}

		System.out.print("Enter the index which value you want to remove: ");
		int index = sc.nextInt();

		Object o = al.remove(index);
		System.out.print("display after removing : "+ al);
	}
*/

/*
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		
		System.out.print("Enter the how many elements you want: ");
		int n =sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			al.add(value);
		}

		System.out.print("Enter the value: ");
		int value = sc.nextInt();
		int index = al.indexOf(value);
		if(index != -1){
			System.out.print("Value Found");
		}
		else{
			System.out.print("Value not found ");
		}
	}
*/

/*
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		
		System.out.print("Enter the how many elements you want: ");
		int n =sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			al.add(value);
		}

		System.out.print("Enter the value: ");
		int value = sc.nextInt();
		int index = al.lastIndexOf(value);
		if(index != -1){
			System.out.print("Value Found "+ index);
		}
		else{
			System.out.print("Value not found ");
		}
	}
*/

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		
		System.out.print("Enter the how many elements you want: ");
		int n =sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			int value = sc.nextInt();
			al.add(value);
		}

		System.out.print("Enter the start index: ");
		int start = sc.nextInt();

		System.out.print("Enter the end index: ");
		int end = sc.nextInt();

		List index = al.subList(start, end);
		System.out.print("Sub List: "+ index);
	}
}