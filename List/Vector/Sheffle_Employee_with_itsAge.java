/*WAP to store 10 employee ages in a Vector and count how many employees are minors (<18), adults (18–60), and seniors (>60).*/

import java.util.*;
class Employee{
	static int Id = 1;
	int id;
	String name;
	int age;
	
	Employee(String name, int age){
		this.id = Id++;
		this.name = name;
		this.age = age;
	}

	void display(){
		System.out.println(id +"\t"+ name+"\t\t"+age);
	}
}
public class Sheffle_Employee_with_itsAge{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Elements you want to add: ");
		int size = sc.nextInt();

		Vector<Employee> v= new Vector<>();

		for(int i = 0; i < size; i++){
			System.out.println("Enter the Employee details: "+(i+1));
			sc.nextLine();
			System.out.print("Enter the name:");
			String name = sc.nextLine();

			System.out.print("Enter the age: ");
			int age = sc.nextInt();

			v.add(new Employee(name, age));
		}

		int mcount = 0;	
		int acount = 0;
		int scount = 0;
		for(int i = 0; i < size; i++){
			if(v.get(i).age <= 18){
				mcount++;
			}
			else if(v.get(i).age > 18 && v.get(i).age <= 60){
				acount++;
			}
			else{
				scount++;
			}
		}
	
		for(Employee e : v){
			e.display();
		}
		System.out.println("Total Minor's Employee are: "+mcount);
		System.out.println("Total Adult's Employee are: "+acount);
		System.out.println("Total Sinor's Employee are: "+scount);
	}
}