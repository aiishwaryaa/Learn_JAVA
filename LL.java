
//LINKLIST SINGLE


public class LL {
    Node head; // Linked list ka head node (starting point)

    // Inner class Node jo linked list ke ek node ko define karta hai
    class Node {
        int data; // Node ka data ya value
        Node next; // Next node ka reference ya pointer

        // Node ka constructor, jo data initialize karta hai aur next ko null set karta hai
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method jo linked list ke starting me naya node add karega
    public void addFirst(int data) {
        Node newNode = new Node(data); // Naya node banate hain given data ke saath
        if (head == null) { // Agar list khaali hai
            head = newNode; // Toh naya node hi head banega
            return;
        }
        newNode.next = head; // Naya node ka next, abhi ke head pe point karega
        head = newNode; // Head ko update karte hain naya node banane ke baad
    }

    // Method jo linked list ke end me naya node add karega
    public void addLast(int data) {
        Node newNode = new Node(data); // Naya node banate hain given data ke saath
        if (head == null) { // Agar list khaali hai
            head = newNode; // Toh naya node hi head banega
            return;
        }
        Node temp = head; // Temporary variable jo list ko traverse karega
        while (temp.next != null) { // List ke end tak pohonchne tak loop chalayenge
            temp = temp.next; // Next node pe move karte hain
        }
        temp.next = newNode; // Last node ke next ko naya node se connect karenge
    }

    // Method jo linked list ko print karega
    public void print() {
        if (head == null) { // Agar list khaali hai
            System.out.println("List is empty"); // Print karo ki list khaali hai
            return;
        }
        Node temp = head; // Temporary variable jo list ko traverse karega
        while (temp != null) { // Jab tak list ke end tak na pohonch jaaye, print karenge
            System.out.print(temp.data + " "); // Har node ka data print karte hain
            temp = temp.next; // Next node pe move karte hain
        }
        System.out.println("null"); // List ke end mein null print karte hain
    }

    public static void main(String[] args) {
        L list = new L();
        list.addFirst(10); // List: 10
        list.addFirst(20); // List: 20 -> 10
        list.addFirst(30); // List: 30 -> 20 -> 10
        list.print(); // List ko print karenge

        list.addLast(40); // List ke end mein 40 add karenge: 30 -> 20 -> 10 -> 40
        list.print(); // Updated list ko print karenge
    }
}
