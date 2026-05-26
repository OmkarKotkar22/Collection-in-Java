/*Write a Java program to remove duplicate elements from an ArrayList of Integer.*/

import java.util.*;
public class Remove_Duplicate_Integer{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the how many elements you want to add: ");
        int n = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        
        System.out.print("Enter the Elements : ");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        List<Integer> unique = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(!unique.contains(list.get(i))){
                unique.add(list.get(i));
            }
        }
        
        System.out.print(unique+ " ");
    }
}