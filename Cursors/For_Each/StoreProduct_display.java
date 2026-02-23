/* we want to create class name as Product with field id,name and price and store 5 product details in it and display it */

import java.util.*;

class Product{
	private static int Id = 1;
	private int id;
	private String name;
	private double price;

	Product(){

	}

	Product(String name, double price){
		this.id = Id++;
		this.name = name;
		this.price = price;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public double getPrice(){
		return price;
	}
}

public class StoreProduct_display{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size that how many elements you want to add: ");
		int size = sc.nextInt();
		Product p[] = new Product[size];

		Vector<Product> v = new Vector<>();
		for(int i = 0; i < size; i++){
			System.out.print("Enter the Product Name: ");
			String pname = sc.next();
			sc.nextLine();

			System.out.print("Enter the Product Price: ");
			double pprice = sc.nextDouble();
		
			p[i] = new Product(pname, pprice);
			v.add(p[i]);
		}

		for(Object obj : v){
			Product p1 = (Product)obj;
			System.out.println(p1.getId() + "\t" + p1.getName() + "\t" + p1.getPrice());
		}
	}
}