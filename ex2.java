import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<temp> temps = new ArrayList<temp>();

        System.out.print("Enter number of cities: ");
        int nC = input.nextInt();
        for (int i = 0; i < nC; i++) {
            System.out.println("Enter details for city " + (i + 1) + ": ");
            System.out.print("\n");
            System.out.print("Enter the Temperature in Celsius: ");
            float celsius = input.nextFloat();
            System.out.print("\n");
            input.nextLine();

            temps.add(new temp(i + 1, celsius, (celsius * 9/5) + 32));

        }
        System.out.println("\nTemperature Details: \n");
        for (temp t : temps) {
            t.tempDetails();
        }
        input.close();
    }
    
}
