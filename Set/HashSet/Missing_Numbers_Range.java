import java.util.*;
public class Missing_Numbers_Range {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.print("Enter how many numbers you want to add: ");
        int n = sc.nextInt();

        System.out.println("Enter numbers:");

        for(int i = 0; i < n; i++){
            set.add(sc.nextInt());
        }

        System.out.print("Missing numbers are: ");

        for(int i = start; i <= end; i++){
            if(!set.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
}