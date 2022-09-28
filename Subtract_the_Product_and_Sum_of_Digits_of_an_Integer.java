import java.util.*;
class Subtract
{
    public static void main(String args[])
    {
        int n,r,sum=0,pro=1,res;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        res=Math.abs(sum-pro);
        System.out.print(res);
    }
}