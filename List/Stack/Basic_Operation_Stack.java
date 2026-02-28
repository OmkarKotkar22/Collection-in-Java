import java.util.*;
public class Basic_Operation_Stack{
	public static void main(String x[]){
		Stack s = new Stack();

		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(500);


		System.out.println("Stack Data: ");
		ListIterator li = s.listIterator(s.size());
		while(li.hasPrevious()){
			Object obj  = li.previous();
			System.out.print(obj + " ");
		}
	}
}