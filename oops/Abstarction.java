package oops;
abstract class Animal{
    Animal(){
        //constructor
        System.out.println("Animal is created");//sbase pehle base class ka cunstructor call hoga 
    }
    abstract void sound();
    public void eat(){
        System.out.println("Eating...");
    }
}

     class Dog extends Animal{
        Dog(){
            //constructor:>> fir  derieved class ka constructor call hoga
            System.out.println("Dog is created");
        }
    public void sound(){
        System.out.println("Barking");
        }
    }

        class Cat extends Animal{
         public void sound(){
        System.out.println(" meows");
         }
        }
public class Abstarction {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();


    }
}
