import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        int n,a1,a2,a3;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a1=0;
        a2=1;
        System.out.print(a1+" "+a2+" ");
        for(int i=2;i<n;i++)
        {
            a3=a1+a2;
            System.out.print(a3+" ");
            a1=a2;
            a2=a3;
        }
    }
}