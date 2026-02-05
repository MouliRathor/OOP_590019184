n
class Student {
    String name;
    int SAPno;

    public Student(String studentName, int id) {
        name = studentName;
        SAPno = id;
        System.out.println("New student record created in the system.");
    }

    void showDetails() {
        System.out.println("Name: " + name + " | SAP No: " + SAPno);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        
        Student s1 = new Student("mouli", 101);
        Student s2 = new Student("Priya", 102);

        s1.showDetails();
        s2.showDetails();
    }
}