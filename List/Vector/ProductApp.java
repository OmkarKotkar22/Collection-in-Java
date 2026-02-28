/*WAP to create class name as Product with id,name ,price and store 10 product detail vector and search product by using its id */

import java.util.*;
class Product{
	static int Id = 1;
	int id;
	String name;
	double price;

	Product(String name, double price){
		this.id = Id++;
		this.name = name;
		this.price = price;
	}

	void display(){
		System.out.print(id + "\t" + name +"\t" + price);
	}
}

public class ProductApp{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the how many Product you want to add: ");
		int size = sc.nextInt();

		Vector<Product> v = new Vector<>();

		for(int i = 0; i < size; i++){
			sc.nextLine();
			System.out.print("Enter the product name: ");
			String name = sc.next();

			System.out.print("Enter the product price: ");
			double price = sc.nextDouble();

			v.add(new Product(name, price));
		}

		System.out.print("Enter the Search Id: ");
		int skey = sc.nextInt();

		System.out.println("After searching by Id");
		boolean found = false;
		for(int i = 0; i < size; i++){
			if(skey == v.get(i).id){
				if(!found){
					System.out.println("Id \t Name \t Price");
				}
				found = true;
				v.get(i).display();
			}
		}
		if(!found){
			System.out.print("No such product found");
		}
	}
}