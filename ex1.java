import java.util.Scanner;
import java.util.ArrayList;
public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<book> books = new ArrayList<book>();

        System.out.print("Enter number of books: ");
        int numBooks = input.nextInt();
        input.nextLine(); 
        for (int i = 0; i < numBooks; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("\n");
            System.out.print("Title: ");
            String title = input.nextLine();
            System.out.print("\n");
            System.out.print("Author: ");
            String author = input.nextLine();
            System.out.print("\n");
            System.out.print("ID: ");
            String ID = input.nextLine();
            System.out.print("\n");
            System.out.print("Price: $ ");
            float price = input.nextFloat();
            System.out.print("\n");
            input.nextLine();

            books.add(new book(i + 1, title, author, ID, price));
        }

        System.out.println("\nBook Details:");
        for (book b : books) {
            b.displayAllDetails();
        }

        input.close();
    }
}
