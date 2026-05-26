/*Remove Even Numbers from Set*/


import java.util.*;
public class Remove_Even_Element{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Elements you want to add in Set: ");
        int n = sc.nextInt();
        
        Set<Integer> set = new HashSet<>();
        System.out.print("Enter the Elements: ");
        for(int i = 0; i < n; i++){
            set.add(sc.nextInt());
        }
        
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int num = it.next();
            
            if(num %2 == 0){
                it.remove();
            }
        }
        
        System.out.print(set+ " ");
    }
}
