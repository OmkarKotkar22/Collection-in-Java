import java.util.*;
public class Vector_Constructor{
	
	/*
		public static void main(String x[]){
		
		Vector v = new Vector();
		int capacity = v.capacity();
		System.out.print("Vector Capacity: "+ capacity);
	}
	*/

	/*
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Capacity: ");
		int capacity = sc.nextInt();
		Vector v = new Vector(capacity);
		System.out.print("Vector Capacity: "+ v.capacity());
	}
	*/

	/*
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Capacity of Vector: ");
		int capacity = sc.nextInt();

		System.out.print("Enter the Inceremental Capacity: ");
		int incCapacity = sc.nextInt();
		
		Vector v = new Vector(capacity, incCapacity);
		v.add(sc.nextInt());
		v.add(sc.nextInt());
		v.add(sc.nextInt());
		v.add(sc.nextInt());
		v.add(sc.nextInt());
		v.add(sc.nextInt());
		//v.add(sc.nextInt());
		System.out.print("Vector Capacity: "+ v.capacity());
	}
	*/

	public static void main(String x[]){
		Scanner sc = new Scanner (System.in);

		Collection c = new ArrayList();
		System.out.print("Add Values in ArrayList:");
		c.add(sc.nextInt());
		c.add(sc.nextInt());
		c.add(sc.nextInt());

		Vector v = new Vector(c);
		System.out.print("Vector: "+ v);
	}
}