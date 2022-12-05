public class Problem_3 {
    public static void main(String[] args) {
//        Factorial digit sum
    /*
    n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
  */
        System.out.println(factorial(12));
    }

    public static long factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}