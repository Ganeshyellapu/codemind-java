import java.util.*;
class Closest
{
    public static boolean ispal(int f)
    {
        int temp,r,rev=0;
        temp=f;
        while(temp>0)
        {
           r=temp%10;
           rev=rev*10+r;
           temp=temp/10;
        }
        if(rev==f)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int k=0;
        for(int i=n-1;i>0;i--)
        {
           if(ispal(i))
           {
               k=i;
               break;
           }
        }
        int l=0;
        for(int j=n+1;j<n*n;j++)
        {
            if(ispal(j))
            {
                l=j;
                break;
            }
        }
        int a,b;
        a=Math.abs(n-k);
        b=Math.abs(n-l);
        if(a>b)
        {
            System.out.print(l);
        }
        else if(a==b)
        {
            System.out.print(k+" "+l);
        }
        else
        {
            System.out.print(k);
        }
    }
}