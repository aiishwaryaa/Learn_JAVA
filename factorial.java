
public class factorial {

 static int fact(int n){
        if(n == 1){
           return 1;
        }else{
           return n*fact(n-1);
        }
       }


    public static void main(String[] args) {
        int num = 5;
        int result = fact(num);
        System.out.println("factorial of " + num + "is" + result);
    }
}
