/* WAP to create ArrayList and perform following operation on it 
  Case 1: Add New element 
  Case 2: View all elements
Case 3: Search element in ArrayList
Case 4: delete element from ArrayList 
Case 5: check the size of ArrayList 
Case 6: retrieve data from ArrayList 
*/


import java.util.*;

/*
 * POJO Class: Book
 * This class represents a Book entity with auto-incremented ID
 */
class Book {

    // Static variable for auto-increment ID
    static int Id = 1;

    // Instance variables
    int id;
    String BookName;
    String AuthorName;
    double price;

    // Constructor
    Book(String BookName, String AuthorName, double price) {
        this.id = Id++;
        this.BookName = BookName;
        this.AuthorName = AuthorName;
        this.price = price;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getBook() {
        return BookName;
    }

    public String getAuthor() {
        return AuthorName;
    }

    // Setter methods (used for update operation)
    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display book details
    void display() {
        System.out.println(id + "\t" + BookName + "\t\t" + AuthorName + "\t\t" + price);
    }
}

/*
 * Main Application Class
 * Book Store Application using ArrayList
 */
public class Book_App {

    public static void main(String x[]) {

        Scanner sc = new Scanner(System.in);

        // Collection to store Book objects
        ArrayList<Book> books = new ArrayList<>();

        do {

            // Menu
            System.out.println("1. Add new Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Id");
            System.out.println("4. Delete Book by Id");
            System.out.println("5. Update Book Details By ID");
            System.out.println("6. Count Total Books");
            System.out.println("7. Count Books By Same Price");
            System.out.println("8. Search Book Author-wise");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                // Case 1: Add new book
                case 1:
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter the Book Name: ");
                    String Book_Name = sc.nextLine();

                    System.out.print("Enter the Author Name: ");
                    String Author_Name = sc.nextLine();

                    System.out.print("Enter the Book Price: ");
                    double price = sc.nextDouble();

                    books.add(new Book(Book_Name, Author_Name, price));
                    System.out.println("Book Added Successfully");
                    System.out.println("============================\n");
                    break;

                // Case 2: View all books
                case 2:
                    System.out.println("Display Books:");
                    if (books.isEmpty()) {
                        System.out.println("Book is not added yet!");
                    } else {
                        System.out.println("Id\tName\t\tAuthor\t\tPrice");
                        for (Book b : books) {
                            b.display();
                        }
                    }
                    System.out.println("============================\n");
                    break;

                // Case 3: Search book by ID
                case 3:
                    System.out.print("Enter the Book ID: ");
                    int s_Id = sc.nextInt();

                    boolean found = false;
                    for (Book b : books) {
                        if (b.getId() == s_Id) {
                            System.out.println("Book Found");
                            System.out.println("Book Title : " + b.getBook());
                            System.out.println("Book Author: " + b.getAuthor());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book Not Found");
                    }
                    System.out.println("============================\n");
                    break;

                // Case 4: Delete book by ID
                case 4:
                    System.out.print("Enter the Book ID to delete: ");
                    int d_Id = sc.nextInt();

                    boolean delete = false;
                    Iterator<Book> it = books.iterator();

                    while (it.hasNext()) {
                        if (it.next().id == d_Id) {
                            it.remove();
                            delete = true;
                            break;
                        }
                    }

                    if (delete) {
                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("Book not found");
                    }
                    System.out.println("============================\n");
                    break;

                // Case 5: Update book details by ID
                case 5:
                    System.out.print("Enter the Book ID to update details: ");
                    int u_Id = sc.nextInt();

                    boolean update = false;

                    for (Book b : books) {
                        if (b.id == u_Id) {

                            sc.nextLine(); // clear buffer

                            System.out.print("Enter the new Book Name: ");
                            String new_name = sc.nextLine();

                            System.out.print("Enter the new Author Name: ");
                            String new_author = sc.nextLine();

                            System.out.print("Enter the new Book Price: ");
                            double new_cost = sc.nextDouble();

                            // Updating existing object
                            b.setBookName(new_name);
                            b.setAuthorName(new_author);
                            b.setPrice(new_cost);

                            update = true;
                            System.out.println("Book details updated successfully");
                            break;
                        }
                    }

                    if (!update) {
                        System.out.println("Book not found for update");
                    }
                    System.out.println("============================\n");
                    break;

                // Case 6: Count total books
                case 6:
                    System.out.println("Total Number of Books: " + books.size());
                    System.out.println("============================\n");
                    break;

                // Case 7: Count books by same price
                case 7:
                    System.out.print("Enter the price to count books: ");
                    double charge = sc.nextDouble();

                    int count = 0;
                    for (Book b : books) {
                        if (b.price == charge) {
                            count++;
                        }
                    }

                    System.out.println("Books with price " + charge + ": " + count);
                    System.out.println("============================\n");
                    break;

                // Case 8: Search books author-wise
                case 8:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter the author name: ");
                    String writer = sc.nextLine();

                    boolean authorFound = false;
                    for (Book b : books) {
                        if (b.AuthorName.equalsIgnoreCase(writer)) {
                            b.display();
                            authorFound = true;
                        }
                    }

                    if (!authorFound) {
                        System.out.println("No books found for this author");
                    }
                    System.out.println("============================\n");
                    break;

                // Exit
                default:
                    System.exit(0);
            }

        } while (true);
    }
}
