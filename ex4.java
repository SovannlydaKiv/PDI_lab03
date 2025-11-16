import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<stuScore> grades = new ArrayList<stuScore>();

        System.out.print("Enter number of students: ");
        int nS = input.nextInt();
        input.nextLine(); 
        System.out.println("");

        for (int i = 0; i < nS; i++) {
            System.out.println("Enter details for student " + (i + 1) + ": ");
            System.out.print("\n");
            
            System.out.print("Enter Name: ");
            String name = input.nextLine();
            
            System.out.print("Enter ID: ");
            String ID = input.nextLine();
            System.out.print("\n");
            
            float marks[] = new float[5];
            System.out.println("Enter marks for 5 subjects: ");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = input.nextFloat();
            }

            input.nextLine(); 
            System.out.print("\n");
            
            grades.add(new stuScore(i + 1, name, marks, ID));
        }
        
        System.out.println("------------------------------\n");
        System.out.println("Grade Details: \n");
        for (stuScore s : grades) {
            s.displayGradeDetails();
        }
        
        input.close();
    }
}