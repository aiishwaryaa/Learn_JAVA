package oops;
//encapsulation:>> Encapsulation ka matlab hai data (variables) aur methods ko 
//ek hi unit mein bandhna, jo class ke through achieve hota hai. Isse hum apne data ko 
//protect kar sakte hain aur controlled access provide kar sakte hain.


class Employee{
    private String name;
    private int age;

public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public void setName(String name){
    this.name = name;
}
public void setAge(int age){
    if(age>0){
        this.age = age;
    }else{
        System.out.println("Invalid age");
    }
}
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee em = new Employee();

        em.setName("rahul");
        em.setAge(25);

        System.out.println("employee name:"+ em.getName());
        System.out.println("employee name:"+ em.getAge());

    }
}
