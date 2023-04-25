import java.util.Scanner;

public class exception74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a: ");
            int a = scanner.nextInt();
            System.out.print("Enter b: ");
            int b = scanner.nextInt();

            if (b == 0) {
                throw new ArithmeticException(" devided by zero is not possible");
            }

            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getClass().getName());
        }

        scanner.close();
    }
}

