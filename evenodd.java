import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        String result = (num1 % 2 == 0 && num2 % 2 == 0) ? "Both are Even" : (num1 % 2 != 0 && num2 % 2 != 0) ? "Both are Odd" :
                        "Mixed (One Even, One Odd)";
                        
        System.out.println(result);
    }
}
