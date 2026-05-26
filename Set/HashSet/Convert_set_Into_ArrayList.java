/*Remove Even Numbers from Set*/


import java.util.*;
public class Convert_set_Into_ArrayList{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Elements you want to add in Set: ");
        int n = sc.nextInt();
        
        Set<Integer> set = new HashSet<>();
        System.out.print("Enter the Elements: ");
        for(int i = 0; i < n; i++){
            set.add(sc.nextInt());
        }
        
        List<Integer> list = new ArrayList<>(set);
        
        System.out.print(list + " ");
    }
}
