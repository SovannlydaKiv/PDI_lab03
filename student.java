public class student {

    
    String name;
    int ID;
    String major;

    student(){ }
    
    student(String newname, int ID, String major){
        name = newname;
        this.ID = ID;
        this.major = major;
    }

    public void print(){
        System.out.println("Name of student: "+name);
        System.out.println("ID: "+ID);
        System.out.println("Major: "+major);
        System.out.println("-------------------------------\n");
    }
    
    public void setUpdateName(String name){
        this.name = name;
    }
}