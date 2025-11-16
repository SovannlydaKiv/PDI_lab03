import java.util.ArrayList;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ims> ex5 = new ArrayList<ims>();

        System.out.print("Enter number of items: ");
        int nI = input.nextInt();   
        input.nextLine();
        System.out.print("\n");

        for (int i = 0; i < nI; i++) {
            System.out.println("Enter details for item " + (i + 1) + ": ");
            System.out.print("\n");
            
            System.out.print("Enter ID: ");
            int ID = input.nextInt();
            input.nextLine();
            
            System.out.print("Enter Name: ");
            String name = input.nextLine();
            
            System.out.print("Enter Quantity: ");
            int quantity = input.nextInt();
            
            System.out.print("Enter Price: $ ");
            float price = input.nextFloat();
            input.nextLine();
            System.out.print("\n");
           
            ex5.add(new ims(i + 1, ID, name, quantity, price));
    
}
        System.out.println("------------------------------");
        System.out.println("\nItem Details: \n");

        for (ims yes : ex5) { 
            yes.itemDetails();
        }
        input.close();
        
    }
    
}
