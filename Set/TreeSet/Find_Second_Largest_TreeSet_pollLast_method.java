/*Find Second Largest Element Using TreeSet*/

import java.util.*;
public class Find_Second_Largest_TreeSet_pollLast_method{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter how many Elements you want to add: ");
         int n = sc.nextInt();
       
         TreeSet<Integer> set = new TreeSet<>();
         System.out.print("Enter the Elements: ");
         for(int i = 0; i < n; i++){
             set.add(sc.nextInt());
         }
        
         set.pollLast();
         System.out.print("Second Last Element: "+ set.last());
     }
}