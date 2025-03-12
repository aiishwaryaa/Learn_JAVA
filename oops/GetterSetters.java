package oops;
class Shape {
    private String color; // Instance variable

    // Constructor
    public Shape(String color) {
        this.color = color; // Instance variable ko initialize kar raha hai
    }

    // Getter for color
    public String getColor() {
        return color; // Instance variable ki value return karta hai
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color; // Instance variable ki value ko update karta hai
    }
}

public class GetterSetters {
    public static void main(String[] args) {
        Shape shape = new Shape("Red"); // Shape object create karte waqt constructor call hoga
        System.out.println("Initial Color: " + shape.getColor()); // Output: Initial Color: Red

        // Color change karna using setter
        shape.setColor("Blue");
        System.out.println("Updated Color: " + shape.getColor()); // Output: Updated Color: Blue
    }
}
