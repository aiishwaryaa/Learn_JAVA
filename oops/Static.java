package oops;
 
class Student{
    String name;
    static String school;

    public static void chhangeSchool(){
        school = "ABC";
    }
}

public class Static {
    public static void main(String[] args) {
        Student.school="mvp";//direct acess to static var
        System.out.println(Student.school);
        Student s = new Student();
        s.name="ram";
        System.out.println(s.name);//ram
        System.out.println(s.school);//ABC
    }
}
