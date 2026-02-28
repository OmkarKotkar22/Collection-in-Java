/*WAP to create an Employee class with id, name, and salary, store 10 employees in a Vector, and display employees with salary above a given amount.*/

import java.util.*;
class Emp{
	static int Id =1;
	int id;
	String name;
	int salary;

	Emp(String name, int salary){
		this.id = Id++;
		this.name = name;
		this.salary = salary;
	}

	void display(){
		System.out.println(id + "\t" + name + "\t" + salary);
	} 
}
public class EmployeeApp_sal{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many employee data you want to insert: ");
		int size = sc.nextInt();

		Vector<Emp> v = new Vector<>();

		for(int i = 0; i < size; i++){
			System.out.println("Enter details of Employee" + (i+1));
			sc.nextLine();

			System.out.print("Enter Name: ");
			String name = sc.nextLine();

			System.out.print("Enter the salary: ");
			int salary = sc.nextInt();

			v.add(new Emp(name, salary));
		}

		System.out.println("Id \t Name \t Salary");
		for(int i = 0; i < size; i++){
			if(v.get(i).salary >= 40000){
				v.get(i).display();
			}
		}
	}
}