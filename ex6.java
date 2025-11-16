import java.util.ArrayList;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<bank> ex6 = new ArrayList<bank>();

        System.out.print("Enter number of accounts: ");
        int nA = input.nextInt();
        input.nextLine();
        System.out.print("\n"); 
        
        for (int i = 0; i < nA; i++) {
            System.out.println("Enter details for account " + (i + 1) + ": ");
            System.out.print("\n");
            
            System.out.print("Enter Account Number: ");
            String accNum = input.nextLine();
            
            System.out.print("Enter Account Holder Name: ");
            String accHolder = input.nextLine();
            
            System.out.print("Enter Balance: $ ");
            double balance = input.nextDouble();
            input.nextLine();
            System.out.print("\n");
            System.out.println("------------------------------");
           
            ex6.add(new bank(accNum, accHolder, balance));
        }
        
        System.out.println("\nAccount Details: \n");

        for (bank acc : ex6) { 
            acc.accountDetails();
        }
        
        System.out.println("\n========== Menu ==========\n");
        System.out.print("Enter account's index (1 to " + nA + "): ");
        int index = input.nextInt();
        input.nextLine();
        System.out.print("\n");
        if (index >= 1 && index <= nA) {
            bank selectedAcc = ex6.get(index - 1);
            
            System.out.print("Choose an operation (1 = Deposit, 2 = Withdraw): ");
            int choice = input.nextInt();
            input.nextLine();
            System.out.print("\n");
            
            if (choice == 1) {
                System.out.print("Enter deposit amount: $");
                double depositAmount = input.nextDouble();
                input.nextLine();
                selectedAcc.deposit(depositAmount);
                System.out.println("\nUpdated Account Details: \n");
                System.out.print("------------------------------\n");
                selectedAcc.accountDetails();
            } 
            else if (choice == 2) {
                System.out.print("Enter withdrawal amount: $");
                double withdrawAmount = input.nextDouble();
                input.nextLine();
                selectedAcc.withdraw(withdrawAmount);
                System.out.println("\nUpdated Account Details: \n");
                System.out.print("------------------------------\n");
                selectedAcc.accountDetails();
            }
        }
        else {
            System.out.println("Invalid account index!");
        }
        System.out.printf("======================================");
        System.out.println("\nThank you for using our banking system! \n");
        input.close();
    }    

}