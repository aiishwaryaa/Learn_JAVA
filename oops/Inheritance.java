package oops;
//single inheritance
class Shape{//base class
    String color;

    public void Area(){//method
        System.out.println("Area of shape is not defined");
    
    }
}
class Circle extends Shape{// child class
public void Area(int r){
 System.out.println((3.14)*r*r);
}}
public class Inheritance {//main class
    public static void main(String[] args) {
        Circle c = new Circle();
        c.Area(5);
        c.color="blue";
        System.out.println(c.color);

    
    }
}
