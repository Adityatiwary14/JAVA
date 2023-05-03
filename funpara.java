import java.util.*;
public class funpara {
    public static void mul(int a,int b){
        int multi=a*b;
        System.out.println("product = "+multi);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter num 1 : ");
        int a=sc.nextInt();
        System.out.println("enter num 2 : ");
        int b=sc.nextInt();
        mul(a,b);
    }
}
