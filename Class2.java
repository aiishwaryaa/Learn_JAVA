
public class Class2{
    public static void main(String[] args) {
        Book b = new Book();
        b.author = "mr. Das";
        b.name= "java";
        b.price = 800;
        b.displayInfo();
    }
}
class Book{
 String name;
 int price;
 String author;

 void displayInfo(){
    System.out.println("Book name: "+name);
    System.out.println("Book Price: "+price);
    System.out.println("Book Author: "+author);
 }
}