import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class exception73 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        scn.close();

        try {
            if (num < 500) {
                throw new CustomException("Number is less than 500");
            } else {
                System.out.println("Number is greater than 500");
            }
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
