import java.util.*;
class Minimum
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        double l=0;
        double r=0;
        for(int i=0;i<n;i++)
        {
            if(Math.pow(2,i)<=n)
            {
                r=Math.pow(2,i);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(Math.pow(2,i)>=n)
            {
                l=Math.pow(2,i);
                break;
            }
        }
        if((l-n)<(n-r))
        {
            System.out.print((int)(l-n));
        }
        else
        {
            System.out.print((int)(n-r));
        }
    }
}