import java.util.*;
class Appy
{
    public static int lcm(int a,int b)
    {
        int lcm=0;
        if(a>b)
        {
            lcm=a;
        }
        else
        {
            lcm=b;
        }
        while(true)
        {
            if(lcm%a==0 && lcm%b==0)
            {
                break;
            }
            else
            {
                lcm++;
            }
        }
        return lcm;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int f=0;f<t;f++)
        {
            long n=sc.nextLong();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int k=sc.nextInt();
            int c=((int)n/a)+((int)n/b)-((int)n/lcm(a,b));
            if(c>=k)
            {
                System.out.println("Win");
            }
            else
            {
                System.out.println("Lose");
            }
        }
    }
}