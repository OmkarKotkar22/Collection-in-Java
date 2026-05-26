import java.util.*;
class Employee{
	static int Id = 1;
	int id;
	String name;
	int salary;

	Employee(String name, int salary){
		this.id = Id++;
		this.name = name;
		this.salary = salary;
	}

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getSalary(){
		return salary;
	}
	
	public void display(){
		System.out.print(id + "\t" + name + "\t" + salary);
	}
}

class sortById implements Comparator{
	public int compare(Object o1, Object o2){
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;

		if(emp1.getSalary() > emp2.getSalary()){
			return 1;
		}
		else if(emp1.getSalary() < emp2.getSalary()){
			return -1;
		}
		else{
			return 0;
		}
	}
}

public class Sorting_Using_Comparator{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Employees: ");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for(int i = 0; i < n; i++){
			sc.nextLine();
			System.out.println("Enter the Employee Details : "+(i+1));
			System.out.print("Enter the Employee Name: ");
			String name = sc.next();

			System.out.print("Enter the Employee Salary: ");
			int salary = sc.nextInt();

			list.add(new Employee(name, salary));
		}

		public static void sort(List list, Comparator c){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n-i-1; j++){
					
					Object o1 = list.get(j);
					Object o2 = list.get(j+1);
					if(c.compare(o1, o2) > 0){
						Object temp = list.get(j);
						list.set(j, list.get(j+1));
						list.set(j+1, temp);
					}
				}
			}
		}

		System.out.print("Original Data");
		for(Object o : list){
			Employee e = (Employee) o;
			e.display();
		}

		System.out.print("\nSorted Data with salary");
		for(Object o : list){
			Employee e = (Employee) o;
			e.display();
		}
	}
}