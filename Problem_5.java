public class Problem_5 {
    public static void main(String[] args) {
//        Highly divisible triangular number
        /*
The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?
         */
        int sum = 0;
        int n = 1;
        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
            System.out.print(sum + ": ");
            for (int j = 1; j < sum + 1; j++) {
                if (sum % j == 0) {
                    if (sum == j) {
                        System.out.print(j);
                        count++;
                    } else
                        System.out.printf(j + ",");
                    count++;
                }
                if (count > 5) {
                    n = 0;
                    break;
                }
            }
            count = 0;
            System.out.println();
            n++;
        }
    }
}
