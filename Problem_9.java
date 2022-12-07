import java.util.*;
public class Problem_9 {
    public static void main(String[] args) {
//        Summation of primes
        /*
        The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
         */
                Scanner scn = new Scanner(System.in);
                int low = scn.nextInt();
                int high = scn.nextInt();
                int sum=0;
                for (int num = low; num <= high; num++) {
                    int div = 2;
                    while (div * div <= num) {
                        if (num % div == 0) {
                            break;
                        }
                        div++;
                    }
                    if (div * div > num) {
                        System.out.println(num);
                        sum +=num;

                    }
                }
                System.out.print(sum);
     }
}
