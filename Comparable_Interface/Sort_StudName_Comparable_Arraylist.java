import java.util.*;
class Student implements Comparable<Student>{
	private static int Roll_No = 1;
	private int id;
	private String name;
	private int marks;

	Student(String name, int marks){
		this.id = Roll_No++;
		this.name = name;
		this.marks = marks;
	}

	public int compareTo(Student s){
		return this.name .compareTo(s.name);
	}
	
	public void display(){
		System.out.println(id + "\t" + name +"\t" + marks);
	}
}

public class Sort_StudName_Comparable_Arraylist{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many records you want to add: ");
		int n = sc.nextInt();

		List<Student> list = new ArrayList<>();

		for(int i = 0; i < n; i++){
			System.out.println("Enter the Students Details: "+ (i+1));
			System.out.print("Enter the Name: ");
			String name = sc.next();

			System.out.print("Enter the Marks: ");
			int marks = sc.nextInt();

			list.add(new Student(name, marks));
		}
		Collections.sort(list);

		System.out.println("Students sorted by marks: ");
		for(Student s : list){
			s.display();
		}
	}
}