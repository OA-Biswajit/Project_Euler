public class Problem_10 {
    public static void main(String[] args) {
//        Reciprocal cycles
        /*
 A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:

1/2	= 	0.5
1/3	= 	0.(3)
1/4	= 	0.25
1/5	= 	0.2
1/6	= 	0.1(6)
1/7	= 	0.(142857)
1/8	= 	0.125
1/9	= 	0.(1)
1/10	= 	0.1
Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.

Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
         */
        double[] arr =new double[1000];
        double[] arr2=new double[1000];
        int length=0;
        Double value=0.0;
        for (int i = 2; i <1000; i++) {
            double a=1;
            a=a/i;
//            System.out.println(a);
            arr[i-2]=a;

            int b =String.valueOf(a).length();
            arr2[i-2]=b;
//            System.out.println(b);
            if (length<arr2[i-2]) {
                length= (int) arr2[i-2];
                value= arr[i-2];

            }
        }
        System.out.println(value);
        System.out.println(length);

    }
}
