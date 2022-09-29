import java.util.*;
class Perfect
{
    public static boolean isper(int n)
    {
        int sum=0,i;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum!=n)
        {
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(isper(n))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}