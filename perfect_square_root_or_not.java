import java.util.*;
class Perfect
{
    public static void main(String args[])
    {
        double n,sq,pf;
        Scanner sc=new Scanner(System.in);
        n=sc.nextDouble();
        sq=(int)Math.sqrt(n);
        pf=sq*sq;
        if(pf==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        
    }
}