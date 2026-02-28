import java.util.*;
public class perform_all_methods_ofStack{
	public static void main(String x[]){
		Stack s = new Stack();

		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		s.push(500);

		System.out.println("Iterator all data: ");
		ListIterator li = s.listIterator(s.size());
		while(li.hasPrevious()){
			Object obj  = li.previous();
			System.out.print(obj + " \n");
		}

		int index = s.search(300);
		System.out.println("Index of Element: "+ index + "\n");

		Object obj = s.pop();
		System.out.println("Removed Element from Stack: "+ obj);
		li = s.listIterator(s.size());
		System.out.print("After pop operation: ");
		while(li.hasPrevious()){
			obj = li.previous();
			System.out.print(obj + " \n");
		}

		obj = s.peek();
		System.out.println("Peek Element: "+ obj);

		li = s.listIterator(s.size());
		System.out.print("Present Elements in Stack: ");
		while(li.hasPrevious()){
			obj = li.previous();
			System.out.print(obj+ " ");
		}
	}
}