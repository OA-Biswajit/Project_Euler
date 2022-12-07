public class Problem_8 {
    public static void main(String[] args) {
//        Special Pythagorean triplet
        /*
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
         */
        for (int i = 0; i <1000 ; i++) {
            for (int j = 0; j <1000; j++) {
                for (int k = 0; k <1000; k++) {
                    if(((i*i + j*j) == k*k && (i<j) && (j<k) && (i<k)) ){
                        if(i+j+k==1000)
                        System.out.printf("%d + %d + %d=%d ; (i*j*k)=%d\n",i,j,k,1000,i*j*k);
                    }

                }
            }

        }
    }
}
