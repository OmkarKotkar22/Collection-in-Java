/*Strings to Uppercase*/

import java.util.*;
public class String_convert_Uppercase_ArrayList{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Elements you want: ");
        int n = sc.nextInt();
        
        List<String> list = new ArrayList<>();
        
        System.out.println("Enter Elements");
        for(int i = 0; i < n; i++){
            list.add(sc.next());
        }
        
        System.out.println("String Convert to Uppercase");
        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            String result = "";
            
            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                if(ch >='a' && ch <= 'z'){
                    ch = (char)(ch-32);
                }
                result = result + ch;
            }
            System.out.println(result);
        }
    }
}

