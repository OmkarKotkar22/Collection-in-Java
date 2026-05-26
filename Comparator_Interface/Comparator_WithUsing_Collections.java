import java.util.*;

class Employee{
	static int Id  = 1;
	int id;
	String name;
	int salary;
	Employee(String name, int salary){
		this.id = Id++;
		this.name= name;
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
		System.out.println(id + "\t" + name + "\t" + salary);
	}
}
class sortById implements Comparator{
	public int compare(Object o1, Object o2){
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		if(emp1.getId() > emp2.getId()){
			return 1;
		}
		else if(emp1.getId() < emp2.getId()){
			return -1;
		}
		else{
			return 0;
		}
	}
}

class sortByName implements Comparator{
	public int compare(Object o1, Object o2){
		Employee emp1 = (Employee) o1;
		Employee emp2 = (Employee) o2;
		return emp1.getName().compareTo(emp2.getName());
	}
}

class sortBySalary implements Comparator{
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


public class Comparator_WithUsing_Collections{
	public static void main(String z[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Employee details you want to add: ");
		int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();
		for(int i = 0; i < n;i++){
			sc.nextLine();
			System.out.println("Enter the Employee Details: "+(i+1));
			System.out.print("Enter the Employee Name: ");
			String name = sc.next();

			System.out.print("Enter the Employee Salary: ");
			int salary = sc.nextInt();
			
			list.add(new Employee(name, salary));
		}
		System.out.println("Original Data");
		System.out.println("ID\tName\tSalary");
		for(Object obj:list) {
			Employee e=(Employee)obj;
			e.display();
		}
		
		System.out.println("\nSort Data With Id");
        Collections.sort(list, new sortById());
        System.out.println("ID\tName\tSalary");
        for(Object o : list){
            Employee emp = (Employee) o;
            emp.display();
        }
        
        System.out.println("\nSort Data With Name");
        Collections.sort(list, new sortByName());
        System.out.println("ID\tName\tSalary");
        for(Object o : list){
            Employee emp = (Employee) o;
            emp.display();
        }
        
		System.out.println("\nSort Data With Salary");
        Collections.sort(list, new sortBySalary());
        System.out.println("ID\tName\tSalary");
        for(Object o : list){
            Employee emp = (Employee) o;
            emp.display();
        }
	}
}