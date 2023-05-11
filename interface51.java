// Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic class. Create one new class calledToTestInt. In this class use the object of arithmetic class.
import java.util.Scanner;

interface test {
        int square(int x);
        
}
class arithmetic implements test{
    public int square(int x){
        return x*x;
    }
}
public class interface51 {
    
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        
        arithmetic a=new arithmetic();
        System.out.println("enter value : ");
        System.out.println(a.square(s1.nextInt()));
    }
}