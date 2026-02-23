/*WAP to create Vector and store 5 Book in it and search book by using its id*/

import java.util.*;

class Book{
	static int Id = 1;
	int id;
	String name;
	String author;

	Book(){

	}
	
	Book(String name, String author){
		id = Id++;
		this.name = name;
		this.author = author;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}
	
	public String getAuthor(){
		return author;
	}
}

public class BookStore{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		Vector<Book> v = new Vector<>();
		Book b[] = new Book[5];
		System.out.println("Enter the Book Details: ");
		for(int i = 0; i < b.length; i++){
//			System.out.print("Enter the Id: ");
//			int id = sc.nextInt();

			System.out.print("Enter the Name: ");
			String name = sc.next();
			sc.nextLine();

			System.out.print("Enter the Author name: ");
			String author = sc.next();
			sc.nextLine();			
			
			b[i] = new Book(name, author);
			v.add(b[i]);
		}

		System.out.println("Display all Details: ");
		System.out.println("Id\t" + "Name\t" + "Author\t");
		Iterator i = v.iterator();
		while(i.hasNext()){
			Object o = i.next();
			Book b1 = (Book)o;
			System.out.println( b1.getId() + "\t" + b1.getName() + "\t" + b1.getAuthor());
		}

		System.out.print("Search Book by id: ");
		System.out.print("Enter the Search Key: ");
		int skey = sc.nextInt();
		boolean found = false;
		i = v.iterator();
		Book b2 = null;
		while(i.hasNext()){
			Object obj = i.next();
			 b2 = (Book)obj;
			if(skey == b2.getId()){
				found = true;
				break;
			}
		}
		if(found){
			System.out.println( b2.getId() + "\t" + b2.getName() + "\t" + b2.getAuthor());
		}
		else{
			System.out.print("Id Not Match");
		}
	}
}