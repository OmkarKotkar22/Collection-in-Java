/*Find Palindrome Strings*/

import java.util.*;
public class Find_Palindrome_Strings{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Elements you want: ");
        int n = sc.nextInt();
        
        List<String> list = new ArrayList<>();
        
        System.out.println("Enter Elements");
        for(int i = 0; i < n; i++){
            list.add(sc.next());
        }
        
        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            String rev = "";
            
            for(int j = str.length()-1; j>=0; j--){
                rev = rev + str.charAt(j);
            }
            if(str.equals(rev))
                System.out.println(str+ " is a Palindrome");
            
            else
                System.out.println(str+ " is not a Palindrome");
        }
    }
}

