import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        int n,rev=0,r,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<0)
        {
           while(n<0)
            {
                r=n%10;
                rev=rev*10+r;
                n=n/10;
            }
            System.out.print(rev);        }
        else
        {
            while(n>0)
            {
                r=n%10;
                rev=rev*10+r;
                n=n/10;
            }
            System.out.print(rev);
        }
        
    }
}