/*Find Maximum Difference Between Elements*/


import java.util.*;
public class Max_difference_btw_Element{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Elements you want to add in Set: ");
        int n = sc.nextInt();
        
        TreeSet<Integer> set = new TreeSet<>();
        System.out.print("Enter the Elements: ");
        for(int i = 0; i < n; i++){
            set.add(sc.nextInt());
        }
        
        int diff = set.last() - set.first();
        System.out.print(set.last() + " " + set.first() + " Maximum difference: " + diff);
    }
}
