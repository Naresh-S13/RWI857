package Association;
//Aggregation

class students{
    private String StudentName;
    private int id;
    students(String StudentName, int id){
        this.StudentName=StudentName;
        this.id=id;
    }
    String getStudentName(){
        return this.StudentName;
    }
    int getId(){
        return this.id;
    }
}

class school{
    private String SchoolName;
    private students student;
    school(String SchoolName){
        this.SchoolName=SchoolName;
    }
    public void setStudent(students student){
        this.student=student;
    }

    public void show(){
        System.out.println("ID "+student.getId()+" Name "+student.getStudentName()+
                " SchoolName "+SchoolName);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        students s1=new students("Java", 10);
        students s2=new students("Python",20);
        school sch=new school("Intellij Idea");
        sch.setStudent(s1);
        school sch1=new school("Eclipse");
        sch1.setStudent(s2);
        sch.show();
        sch1.show();

    }
}