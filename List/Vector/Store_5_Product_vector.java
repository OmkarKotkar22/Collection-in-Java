/* we want to create class name as Product with field id,name and price and store 5 product details in it and display it */

import java.util.*;
class Product{
	static int Id = 1;
	int id;
	String name;
	int price;

	public Product(String name, int price){
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

	public int getPrice(){
		return price;
	}
} 

public class Store_5_Product_vector{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		Vector<Product> v = new Vector<>();

		//Product p[] = new Product[5];
		for(int i = 0; i < 5; i++){
			System.out.println("Enter product details: "+(i+1));
			System.out.print("Enter name: ");
			String name = sc.next();
			sc.nextLine();

			System.out.print("Enter the price: ");
			int price  = sc.nextInt();

			v.add(new Product(name, price));
		}

		System.out.println("Display all records: ");
		System.out.print("Id\t Name\t Price");
		for(int i = 0; i < v.size(); i++){
			Product p = v.get(i);
			System.out.print(p.getId()+ "\t" + p.getName()+"\t" + p.getPrice());
		}
	}
}