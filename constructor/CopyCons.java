package constructor;
//copyconstructor ka kaam hota hai ek obj ko copy kar k dusre obj me daal dena 
class Studentt{
String name;
int age;

public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
//agar parametrer me nam aur age nhi ata koi dusra  student s2  ata toh jis bhi obj k constructor calll hoga uske this .name and age  me s2.name and age  store hogi
Studentt(Studentt s2){
    this.name = s2.name;
    this.age = s2.age ;
}
Studentt(){

}
}
public class CopyCons {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        s1.name = "Rahul";
        s1.age = 20;
        Studentt s2 = new Studentt(s1);
        s2.printInfo();
    }
}
