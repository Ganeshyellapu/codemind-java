import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        int n,n1=0,n2=1,n3,ans=0;
        int c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n3=n1+n2;
        while(n3<=n)
        {
            n1=n2;
            n2=n3;
            n3=n1+n2;
            if(Math.abs(n3-n)>Math.abs(n2-n))
            {
                ans=n2;
                
            }
            else if(Math.abs(n3-n)==Math.abs(n2-n))
            {
                c+=1;
            }
            else
            {
                ans=n3;
            }
        }
        if(c==0)
        {
            System.out.print(ans);
        }
        else
        {
            System.out.print(n2+" "+n3);
        }
    }
}