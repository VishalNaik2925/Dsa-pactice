class Student{
    long rollNo;
    String name;
    String branch;
    char section;
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.rollNo=101;
        s1.name="John Doe";
        s1.branch="Computer Science";
        s1.section='A';

        System.out.println("Student 1 Details:");
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("Name: " + s1.name);
        System.out.println("Branch: " + s1.branch);
        System.out.println("Section: " + s1.section);   
    }
    
}
