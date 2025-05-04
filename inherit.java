
 class Animal{
     void eat(){
        System.out.println("animal eats food");
    }
}

 class Dog extends Animal{
     void bark(){
        System.out.println("dog barks");
    }
}


public class inherit {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
        System.out.println("this is inheritance!!");
    }
}
