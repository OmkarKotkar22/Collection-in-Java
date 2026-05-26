import java.util.*;
public class duplicate_in_Set{
	public static void main(String x[]){
		int a[] = new int[]{5,6,44,5,6,8};
		HashSet hs = new HashSet();

		for(int i = 0; i < a.length; i++){
			hs.add(a[i]);
		}

		System.out.print("After remove duplicate: "+ hs);
	}
}