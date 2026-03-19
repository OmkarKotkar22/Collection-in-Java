/* WAP to create ArrayList and perform following operation on it 
   Case 1: Add New element 
   Case 2: View all elements
   Case 3: Search element in ArrayList
   Case 4: Delete element from ArrayList 
   Case 5: Check the size of ArrayList 
   Case 6: Retrieve data from ArrayList 
*/

import java.util.*;

public class perform_All_Operations_ArrayList {

    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        do {
            System.out.println("1. Add New Elements");
            System.out.println("2. View all Elements");
            System.out.println("3. Search Element in ArrayList");
            System.out.println("4. Delete element from ArrayList");
            System.out.println("5. Check the size of ArrayList");
            System.out.println("6. Retrieve data from ArrayList");
            System.out.println("7. Exit");
            System.out.print("Enter the choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter how many elements you want to add: ");
                    int size = sc.nextInt();

                    System.out.print("Enter the Elements: ");
                    for (int i = 0; i < size; i++) {
                        int value = sc.nextInt();
                        al.add(value);
                    }

                    System.out.println("Values added successfully");
                    System.out.println("\n================================\n");
                    break;

                case 2:
                    System.out.print("View Elements: ");
                    for (Integer val : al) {
                        System.out.print(val + " ");
                    }
                    System.out.println("\n================================\n");
                    break;

                case 3:
                    System.out.print("Enter Search Element: ");
                    int data = sc.nextInt();

                    if (al.contains(data)) {
                        System.out.println("Data Found: " + data);
                    } else {
                        System.out.println("Data Not Found");
                    }

                    System.out.println("\n================================\n");
                    break;

                case 4:
                    System.out.print("Enter the Element to Delete: ");
                    int d = sc.nextInt();

                    int index = al.indexOf(d);
                    if (index != -1) {
                        al.remove(index);
                        System.out.println("Data deleted successfully");
                    } else {
                        System.out.println("Element not found");
                    }

                    System.out.println("\n================================\n");
                    break;

                case 5:
                    System.out.println("Size of ArrayList: " + al.size());
                    System.out.println("\n================================\n");
                    break;

                case 6:
                    System.out.print("Retrieve ArrayList Elements: [ ");
                    for (Integer v : al) {
                        System.out.print(v + " ");
                    }
                    System.out.println("]");
                    System.out.println("================================\n");
                    break;

                default:
                    System.exit(0);
            }

        } while (true);
    }
}
