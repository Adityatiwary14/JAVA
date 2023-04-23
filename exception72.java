// Create an exception class, which throws an exception if operand is non numeric in calculating modules. (Use command line arguments). 
import java.util.Scanner;
public class exception72 {
    public void throwexp(){

        Scanner s1=new Scanner(System.in);
        System.out.println("enter first number : ");
        int num1 =s1.nextInt();

        System.out.println("enter second number : ");
        int num2= s1.nextInt();

        int mod=num1%num2;
        System.out.println("mode is : "+mod);

        try {
                System.out.println("cannot divide by zero");
        } catch (Exception e) {

            System.out.println("number cant be decvided by zero");
        }
    }
    public static void main(String[] args) {
        exception72 e1=new exception72();
        e1.throwexp();
    }
    
}
