import java.util.*;
class Fib
{
    public static boolean isper(int z)
    {
        int s=(int)Math.sqrt(z);
        return (s*s==z);
    }
    public static boolean isfib(int x)
    {
        return isper(5*x*x+4) || isper(5*x*x-4);
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(isfib(n))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}