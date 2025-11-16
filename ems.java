public class ems {
    int n;
    int ID;
    String name;
    float bSalary;
    float gSalary;
    float hra;
    float tca;
    ems(){ 

    }

    public ems(int n, int ID, String name, float bSalary) {
        this.n = n;
        this.ID = ID;
        this.name = name;
        this.bSalary = bSalary;
        this.hra = bSalary * 0.2f;
        this.tca = bSalary * 0.1f;
        this.gSalary = bSalary + hra + tca;
    }

    public void EmployeeDetails() {
        System.out.println("Employee " + n + "\n");
        System.out.println("ID: " + ID);                
        System.out.println("Name: " + name + "\n");
        System.out.println("Basic Salary: " + bSalary); 
        System.out.println("HRA: " + hra);
        System.out.println("TCA: " + tca);
        System.out.println("Gross Salary: " + gSalary + "\n");
        System.out.println("------------------------------\n");
    }
             
}
