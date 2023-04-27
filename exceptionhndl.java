public class exceptionhndl {
    public static void main(String[] args) {
//         int a=5;
//         int b=0;
//          try {
//             int c=a/b;
//          } catch (ArithmeticException e) {
//             System.out.println("we have solved the problem");
//          }
//     }
// }


// there are many types of ecceptions
// try catch 
// try multiple catches
// nesting of try block

// NullPointerException

// String s1 = null;
// try {
//     System.out.println(s1.length());
// } catch (NullPointerException e) {
//    System.out.println("their is a null pointer");
// }
//     }
// }

// ArrayIndexOutOfBoundsException

int[] arr1={1,2,3};
try {
    System.out.println(arr1[4]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("element not present");
}


    }
}