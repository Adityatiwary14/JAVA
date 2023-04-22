// Write a program in Java to display the names and roll numbers of students. Initializerespective array variables for 10 students. Handle ArrayIndexOutOfBoundsExeption,so that any such problem doesn’t cause illegal termination of program.
public class exceptiion71 {
        public static void main(String[] args) {
            String[] names = {"adi","shivam","tushar","rishabh"};
            int[] rollNumbers = {1,2,3,4};
    
            try {
                for (int i = 0; i <= 4; i++) {
                    System.out.println("Roll Number: " + rollNumbers[i] + ", Name: " + names[i]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds exception occurred. Please check array sizes.");
            }
    }
}