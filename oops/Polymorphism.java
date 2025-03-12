package oops;
//polymorphism means many forms(same name functions but diiferent work)
//method overloading(compile time )
 class Stdnt{
     String name;
     int age;
     public void printInfo(String name,int age){
        System.out.println(name+" "+age);
 }
 public void printInfo(String name){
    System.out.println(name);

 }
 public void printInfo( int age ){
    System.out.println(age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Stdnt s1 = new Stdnt();
        s1.name ="raam";
        s1.age= 34;
        s1.printInfo(s1.name, s1.age);
    }
}
