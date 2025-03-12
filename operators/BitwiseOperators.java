public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5 , b = 3; // Binary of 5 is 0101, and 3 is 0011

        System.out.println("a & b: " + (a & b));  // Bitwise AND >>> 1(0001)
        System.out.println("a | b: " + (a | b));  // Bitwise OR >>> 7(0111)
        System.out.println("a ^ b: " + (a ^ b));  // Bitwise XOR >>> 6(0110)
        System.out.println("a << 1: " + (a << 1));// Left Shift
        System.out.println("a >> 1: " + (a >> 1));// Right Shift
    }
}

