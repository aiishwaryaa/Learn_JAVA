package constructor;

public class DefaultCon {
    public static void main(String[] args) {
        Car c  = new Car();
        c.display();

    }
}
 class Car{
    String brand;
    int price;
    int year;
     
      void display(){
        System.out.println("brand: "+ brand + " year: "+ year + "price: " + price );
      }
 }
 // output >> brand: null   year: 0  price: 0