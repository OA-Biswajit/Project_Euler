import java.util.*;
public class Problem_7 {
        public static void main(String[] args) {
//       10001st prime
        /*
      By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
         */
            Scanner scn = new Scanner(System.in);
            long low = scn.nextInt();
            int high = scn.nextInt();
            int  i=0;
            long[] res =new long[high];
            for (long num = low; num <= high; num++) {
                int div= 2;
                while ((long) div * div <= num) {
                    if (num % div == 0) {
                        break;
                    }
                    div++;
                }
                if ((long) div * div > num) {
                    res[i]=num;
                    i++;
                    System.out.println(num);
                }

            }
            System.out.println(res[i-1]);

        }

}
