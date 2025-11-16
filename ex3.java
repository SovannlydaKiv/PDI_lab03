import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<ems> eMs = new ArrayList<ems>();

        System.out.print("Enter number of employees: ");
        int nE = input.nextInt();
        System.out.print("\n");  
        input.nextLine();  

       for (int i = 0; i < nE; i++) {
        System.out.println("Enter details for employee " + (i + 1) + ": ");
        System.out.print("\n");
        
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter ID: ");
        int ID = input.nextInt();
        
        System.out.print("Enter Basic Salary: $ ");
        float bSalary = input.nextFloat();
        input.nextLine(); 
        System.out.print("\n");
        
        eMs.add(new ems(i + 1, ID, name, bSalary));
    }
        System.out.println("------------------------------");
        System.out.println("\nEmployee Details: \n");
        for (ems e : eMs) { 
            e.EmployeeDetails();
        }
        input.close();
    }
}
