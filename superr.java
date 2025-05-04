class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();  // Calls Animal's sound()
        System.out.println("Dog barks");
    }
}

public  class superr {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
