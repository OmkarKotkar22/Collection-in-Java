// /*Find Kth Largest Element Using TreeSet*/


import java.util.*;
public class Find_Kth_large_Using_Iterator{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Elements you want to add: ");
        int n = sc.nextInt();
        
        TreeSet<Integer> set = new TreeSet<>();
        System.out.print("Enter the Elements: ");
        for(int i = 0; i < n; i++){
            set.add(sc.nextInt());
        }
        
        System.out.print("Enter the K: ");
        int k = sc.nextInt();
        
        System.out.print(set + " ");
        Iterator<Integer> itr = set.descendingIterator();
        int count = 1;
        
        while(itr.hasNext()){
            int val = itr.next();
            
            if(count == k){
                System.out.print(k+"th Largest: "+ val);
                break;
            }
            count++;
        }
    }
}
