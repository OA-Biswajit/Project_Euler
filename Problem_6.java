public class Problem_6 {
    public static void main(String[] args) {
//        Power digit sum
      /*
        2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
        */
        int p=1000;
        int powOfNum=(int)Math.pow(2,p);
        System.out.println(powOfNum);
        int sum=0;
        int len=String.valueOf(powOfNum).length();
        for (int i = 0; i <len; i++)
        {
            int rem=powOfNum%10;
            sum += rem;
            powOfNum=powOfNum/10;
        }
        System.out.print(sum);

    }
}
