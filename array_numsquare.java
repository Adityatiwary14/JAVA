import java.util.*;
public class array_numsquare {
        public static void main(String[] args) {
            int[] numbers = new int[10];
            int sum = 0;
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number " + (i+1) + ": ");
                numbers[i] = sc.nextInt();
            }
            
            for (int i = 0; i < numbers.length; i++) {
                int squared = numbers[i] * numbers[i];
                System.out.println(squared);
                sum += squared;
                System.out.println("The square of "+numbers[i]+" is: "+squared);
            }
            System.out.println("The sum of the squared numbers is: "+sum);
    }
    }