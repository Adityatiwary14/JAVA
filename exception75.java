class Calc {
    public long power(int a, int b) throws Exception {
        if (a == 0 && b == 0) {
            throw new Exception("a and b should not be zero");
        } else if (a < 0 || b < 0) {
            throw new Exception("a and b should be non-negative");
        } else {
            return (long) Math.pow(a, b);
        }
    }
}
public class exception75 {
    public static void main(String[] args) {
        Calc calc = new Calc();

        try {
            long result1 = calc.power(8, 3);
            System.out.println(result1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            long result2 = calc.power(-4, 5);
            System.out.println(result2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            long result3 = calc.power(0, 0);
            System.out.println(result3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}