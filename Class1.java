

public class Class1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.model= "maruti suzuki";
        c.color = "red";
        c.year = 2010;
        c.display();
    }
}
 class Car{
    String model;
    int year;
    String color;
    void display(){
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
        System.out.println("Color: "+color);
    }
 }
