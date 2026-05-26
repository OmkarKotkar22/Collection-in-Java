/*Check Two Sets Are Equal*/


import java.util.*;
public class Check_both_set_are_equal_or_not{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Elements you want to add in 1st Set: ");
        int n1 = sc.nextInt();
        
        Set<Integer> set1 = new HashSet<>();
        System.out.print("Enter the Elements: ");
        for(int i = 0; i < n1; i++){
            set1.add(sc.nextInt());
        }
        
        System.out.print("Enter how many Elements you want to add in 2nd Set: ");
        int n2 = sc.nextInt();
        
        Set<Integer> set2 = new HashSet<>();
        System.out.print("Enter the Elements: ");
        for(int i = 0; i < n2; i++){
            set2.add(sc.nextInt());
        }
        
        if(set1.equals(set2))
            System.out.print("Yes Both are Equal");
    
        else
            System.out.print("No Not Equal");
    }
}
