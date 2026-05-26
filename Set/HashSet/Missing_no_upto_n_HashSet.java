import java.util.*;
public class Missing_no_upto_n_HashSet{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements you want to add: ");
        int n = sc.nextInt();
        
        System.out.print("Enter the Maximum range: ");
        int range = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        
        System.out.print("Enter the numbers: ");
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            set.add(num);
        }
        
        System.out.println("Missing Numbers are: ");
        for(int i = 0; i <= range; i++){
            if(!set.contains(i))
                System.out.print(i + " ");
        }
    }
}