package oops;
//multilevel inheritance:>>
//Java mein multilevel inheritance ka purpose hi ye 
//hai ki hume subclass ke object mein parent aur grandparent class ki 
//properties aur methods automatically mil jayein.is liye humne equivalent triangle ka object bnaya .
class Shape{
    String color;

    public void Area(){
        System.out.println("Area of shape ");
    }

}

class Triangle extends Shape{

    
    public void Area(int l, int h){//method overload of shape
        System.out.println("Triangle Area :"+ (0.5*l*h));
    }
}

class EqualateralTriangle extends Triangle{//method  overload 
    public void Area(int l, int h){
        System.out.println("Equalateral Triangle Area :"+(0.5*l*h));
}
public void callShapeArea() {
    super.Area(); // ye Shape class ka Area method call karega
}
}

public class Multilevel {
    public static void main(String[] args) {
        EqualateralTriangle et = new EqualateralTriangle();
        et.Area(10, 20);
        et.color = "red";
       // Java mein agar kisi class ke attribute ko access karna ho toh hamesha object ke sath . ka use karna padta hai.
        System.out.println(et.color);
        et.callShapeArea();
    }
}
