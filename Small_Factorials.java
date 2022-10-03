import java.util.*;
class Factorial
{
    public static int fact(int n)
    {
        int facto=1;
        for(int i=1;i<=n;i++)
        {
            facto=facto*i;
        }
        return facto;
    }
    public static void main(String args[])
    {
        int n,a,factorial;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a=sc.nextInt();
            factorial=fact(a);
            System.out.println(factorial);
        }
        
    }
}