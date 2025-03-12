

// Access Modifiers Example:
// Java mein chaar tareeke ke access modifiers hote hain: public, private, protected, aur default (koi keyword nahi).
// Ye modifiers define karte hain ki kaunsi properties aur methods ko kis scope mein access kiya ja sakta hai.

class Person {
    public String name;       // public - accessible from anywhere
    private int age;          // private - sirf is class ke andar hi accessible
    protected String address; // protected - accessible within package aur subclasses ke liye
    String profession;        // default (no modifier) - sirf package ke andar accessible

    // Public method - accessible from anywhere
    public void setDetails(String name, int age, String address, String profession) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.profession = profession;
    }

    // Private method - sirf is class ke andar accessible hai
    private void displayAge() {
        System.out.println("Age: " + age);
    }

    // Protected method - within package aur subclasses ke liye accessible
    protected void displayAddress() {
        System.out.println("Address: " + address);
    }

    // Default method - sirf package ke andar accessible hai
    void displayProfession() {
        System.out.println("Profession: " + profession);
    }

    // Public method - access modifiers ko check karne ke liye methods ko call kar raha hai
    public void showInfo() {
        System.out.println("Name: " + name);
        displayAge(); // private method ko is class ke andar se call kar sakte hain
        displayAddress(); // protected method bhi accessible hai
        displayProfession(); // default method bhi accessible hai
    }
}

public class AccessModifiersExample {
    public static void main(String[] args) {
        Person person = new Person();

        // Public method and property - accessible from anywhere
        person.setDetails("Rahul", 25, "Delhi", "Engineer");
        System.out.println("Name: " + person.name); // public property ko directly access kar sakte hain

        // Private property ko direct access nahi kar sakte
        //System.out.println(person.age); // Error: age private hai
        //person.displayAge();//ye tbhi likhh skate hai jb age ka method public ho 

        // Protected and default methods accessible hai within package
        person.displayAddress(); // protected method ko access kiya package ke andar
        person.displayProfession(); // default method bhi accessible hai

        // Public method ko call karke saari information display karenge
        person.showInfo();
    }
}

