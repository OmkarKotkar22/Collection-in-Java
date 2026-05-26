/*Reverse Strings*/

import java.util.*;
public class Reverse_n_ofString_ArrayList{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Elements you want: ");
        int n = sc.nextInt();
        
        List<String> list = new ArrayList<>();
        
        System.out.println("Enter Elements");
        for(int i = 0; i < n; i++){
            list.add(sc.next());
        }
        
        for(String s : list){
            String rev = "";
            for(int i = s.length()-1; i >= 0 ; i--){
                rev = rev + s.charAt(i);
            }
            System.out.println(rev);
        }
    }
}