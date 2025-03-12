package oops;
// Hierarchical Inheritance ka matlab yeh hota hai ki ek hi parent class se multiple subclasses inherit kar sakte hain.
// Is code mein `Shape` base class hai, aur `Triangle` aur `Circle` uske child classes hain.
// Yeh hierarchical inheritance ka example hai kyunki `Shape` ke do alag-alag subclasses hain jo uski properties aur methods inherit kar rahe hain.
// `Triangle` aur `Circle` dono mein `Shape` ki common properties aur methods aa jate hain, jaise `color` attribute.
// Saath hi, dono subclasses apne area calculate karne ke methods bhi add kar rahe hain, jo unhe specific functionality de rahe hain.
// Matlab, `Triangle` ka area alag formula se aur `Circle` ka area apne alag formula se calculate hota hai, lekin dono classes `Shape` se hi inherit ho rahi hain.

class Shape{
    String color;
    
    public void Area(){
        System.out.println("Area of shape ");
    }

}

class Triangle extends Shape{
    public void Area(int l, int h){//method overload of shape
        System.out.println("Triangle Area :"+ 0.5*l*h);
    }
}

class Circle extends Triangle{
    public void Area(int r){
        System.out.println("circle area: "+(3.14)*r*r);
}
}

public class Hierachical {
    public static void main(String[] args) {
        Triangle t = new Triangle();//triangle obj
        t.Area(10, 20);

        Circle c =  new Circle();//circle obj
        c.Area(10);
    }
}
