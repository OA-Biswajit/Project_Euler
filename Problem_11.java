public class Problem_11 {
    public static void main(String[] args) {
//        Largest palindrome product
    /*
        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

        Find the largest palindrome made from the product of two 3-digit numbers.
            */
        long result=0;
        for (int i=999;i>=100;i--)
        {
            for(int j=999;j>=100;j--)
            {
                long p=i*j;
                if(p==rev(p)&&p>result)
                    result=p;
            }
        }
        System.out.println(result);
    }
    public static long rev(long p)
    {
        long rev=0;
        while(p!=0)
        {
            long rem=p%10;
            rev=rev*10+rem;
            p/=10;
        }
        return rev;
    }
}