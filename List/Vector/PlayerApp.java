/*WAP to create Player class and store player id,name ,run in Vector class and and 
sort player data using its run as well as find the list of player whose run is same */

import java.util.*;
class Player{
	int id;
	String name;
	int run;

	Player(int id, String name, int run){
		this.id = id;
		this.name = name;
		this.run = run;
	}

	void display(){
		System.out.println(id + "\t" + name + "\t" + run);
	}
}

public class PlayerApp{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many players details you want to add: ");
		int size = sc.nextInt();

		Vector<Player> v = new Vector<>();

		for(int i = 0; i < size; i++){
			System.out.println("Enter details of player " + (i + 1));

			System.out.print("Enter the id: ");
			int id = sc.nextInt();

			sc.nextLine();
			System.out.print("Enter the name: ");
			String name = sc.next();

			System.out.print("Enter the run: ");
			int run = sc.nextInt();

			v.add(new Player(id, name, run));
		}

		for(int i = 0; i < size; i++){
			for(int j = 0; j < size-i-1; j++){
				if(v.get(j).run > v.get(j+1).run){
					Player temp = v.get(j);
					v.set(j, v.get(j+1));
					v.set(j+1, temp);
				}
			}
		}

		System.out.println("Display after sorting: ");
		for(Player p : v){
			p.display();
		}

		boolean found = false;
		for(int i = 0; i < size-1; i++){
			if(v.get(i).run == v.get(i+1).run){
				if(!found){
					System.out.println("Player with same run");
					System.out.println("Id \t Name \t Run");
				}
			found = true;
			v.get(i).display();
                	v.get(i + 1).display();
                	System.out.println("---------------------");
			}

			
		}

		if(!found){
			System.out.print("No such player have same runs");
		}
	}
}