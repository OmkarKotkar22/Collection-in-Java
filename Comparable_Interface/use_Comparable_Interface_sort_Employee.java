import java.util.*;

class Employee implements Comparable{
	public static int Id = 1;
	private int id;
	private String name;
	private int salary;
	Employee(){}
	Employee(String name, int salary){
		this.id = Id++;
		this.name = name;
		this.salary = salary;
	}

	public void display(){
		System.out.println(id + "\t" + name + "\t" + salary);
	}

	

	public int compareTo(Object o){
		Employee emp = (Employee) o;	
		if(this.salary > emp.salary)
			return 1;
		else if(this.salary < emp.salary)
			return -1;
		else
			return 0;
	}
}

public class use_Comparable_Interface_sort_Employee{
	public static void main(String z[]){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter the how many records you want to Insert: ");
		int n = sc.nextInt();
		Employee emp[] = new Employee[n];
		for(int i = 0; i < n; i++){
			System.out.print("\ncount"+(i+1)+"\n");

			System.out.print("Enter the Name: ");
			String name = sc.next();

			System.out.print("\nEnter the salary: ");
			int salary = sc.nextInt();

			emp[i] = new Employee(name, salary);
		}

		Arrays.sort(emp);
		System.out.println("display details: ");

		System.out.println("ID \t Name \t Salary");
		for(int i = 0; i < n; i++){
			emp[i].display();
		}
	}
}