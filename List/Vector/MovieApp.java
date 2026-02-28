/*WAP to create a Movie class with id, name, and rating, store 10 movies in a Vector, and display the movie(s) with the highest rating.*/

import java.util.*;
class Movie{
	static int Id = 1;
	int id;
	String name;
	double rating;
	
	Movie(String name, double rating){
		this.id = Id++;
		this.name = name;
		this.rating = rating;
	}

	void display(){
		System.out.println(id + "\t" + name + "\t\t" + rating);
	}
}
public class MovieApp{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Movie's you want to add: ");
		int size = sc.nextInt();

		Vector<Movie> v = new Vector<>();
		for(int i = 0; i < size; i++){
			System.out.println("Enter the details of Movie: "+ (i+1));
			sc.nextLine();

			System.out.print("Enter the Movie Name: ");
			String name = sc.nextLine();

			System.out.print("Enter the movie rating: ");
			double rating = sc.nextDouble();

			v.add(new Movie(name, rating));
		}

		Vector<Movie> result = new Vector<>();
		System.out.println("Id\tName\t\t Rating");
		for(int i = 0; i < size; i++){
			int high = 5;
			if(v.get(i).rating == high){
				v.get(i).display();
			}
		}
	}
}