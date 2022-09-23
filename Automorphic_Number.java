import java.util.*;
class Auto
{
    public static void main(String args[])
    {
        int n,sq,c,last;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sq=n*n;
        c=(int)Math.log10(n)+1;
        last=(sq%(int)Math.pow(10,c));
        if(n==last)
        {
            System.out.print("Automorphic Number");
        }
        else
        {
            System.out.print("Not an Automorphic Number");
        }
        
    }
}