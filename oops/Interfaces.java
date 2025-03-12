package oops;
//Interfaces classes ke rules define karte hain.
//Inhe direct object bana ke use nahi kar sakte.
//Jis class ne interface implement kiya, usse uske sare functions likhne padenge.
//Abstraction aur polymorphism achieve karne mein madad milti hai.

interface Person{
    int hands = 2;// variables will be final abstarct and static
    void walk();
}
interface Human{//multiple inheritance:>> (only possible with interfaces )
    void eat();
}
class Man implements Person, Human{
    public void walk(){
        System.out.println("man is walking");
    }
    public void eat(){
        System.out.println("Human eats food");
        }
        }
public class Interfaces {
    public static void main(String[] args) {
    Man m = new Man();
        m.walk();
        m.eat();
        
    }
}
