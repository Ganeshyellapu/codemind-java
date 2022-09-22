import java.util.*;
class Prime
{
    public static void main(String args[])
    {
       int n,c=0;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       for(int i=2;i<Math.sqrt(n);i++)
       {
           if(n%i==0)
           {
               c+=1;
           }
       }
       if(c==0)
       {
           System.out.print("prime");
       }
       else
       {
           System.out.print("not a prime");
       }
    }
}