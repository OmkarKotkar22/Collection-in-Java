package iterator;

public class Employee {
	private static int counter_id = 1;
	private int id;
	private String name;
	private double salary;
	
	Employee(){
		
	}
	
	Employee(String name, double salary){
		this.id = counter_id++;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
}
