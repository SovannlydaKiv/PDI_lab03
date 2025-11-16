import java.util.ArrayList;
import java.util.List;
public class studentTest {
    public static void main(String[] args) {
        student student1 = new student();
        student student2 = new student("Inthera", 20240019, "SE");

        student1.setUpdateName("Theary");

        List<student> students = new ArrayList<student>();
        students.add(student1);
        students.add(student2);
        students.add(new student("Rithysak", 20240043, "SE"));
        students.add(new student("Vanheng", 20240035, "SE"));

        for(student s : students){
            s.print();
        }
    }
    
}
