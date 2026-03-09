/* we want to create class name as Product with field id,name and price and store 5 product details in it and display it */

/* we want to create class name as Product with field id,name and price and store 5 product details in it and display it */

import java.util.*;
class Product{
	private static int Id = 1;
	private int Pid;
	private String Pname;
	private int Pprice;
	
	Product(String name, int price){
		Pname = name;
		Pprice = price;
	}

	public void display(){
		System.out.println(Pid + "\t\t" + Pname + "\t\t" + Pprice);
	}
}

public class Product_with_5Records_Vector{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the how many product records you want to insert: ");
		int n = sc.nextInt(); 
		List<Product> v = new Vector<>();
		for(int i = 0; i < n; i++){
			System.out.println("Enter the details of Product: "+ (i+1));
			System.out.print("Enter the Product Name: ");
			String name = sc.next();

			System.out.print("\nEnter the Product Price: ");
			int price = sc.nextInt();

			v.add(new Product(name, price));
		}

		System.out.println("Display Product Details");
		for(Product p : v){
			p.display();
		}
	}
}