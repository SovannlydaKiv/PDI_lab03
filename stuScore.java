public class stuScore {
    int n;
    String name;
    String ID;
    float[] marks;
    char grade;
    float average;
    float total;

    stuScore(){ 

    }
    public stuScore(int n, String name, float[] marks, String ID) {
        this.n = n;
        this.name = name;
        this.ID = ID;
        this.marks = marks;
        this.total = 0;
        for (float mark : marks) {
            this.total += mark;
        }
        this.average = total / marks.length;
        if (average >= 90) {
            this.grade = 'A';
        } else if (average >= 75) {
            this.grade = 'B';
        } else if (average >= 50) {
            this.grade = 'C';
        } else if (average < 50) {
            this.grade = 'F';
        } 
    }


    public void displayGradeDetails(){
        System.out.println("Student " + n + "\n");
        System.out.println("Name: " + name); 
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade + "\n");
        System.out.println("------------------------------\n");
    }   
    
}
