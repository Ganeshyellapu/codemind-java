import java.util.*;
class Digits
{
    public static int digitsum(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        if(sum>=9)
        {
            return digitsum(sum);
        }
        return sum;
    }
    public static void main(String args[])
    {
        int n,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=digitsum(n);
        System.out.print(a);
    }
}