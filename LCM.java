import java.util.*;
class Lcm
{
    public static void main(String args[])
    {
        int n,m,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=2;i<n*m;i++)
        {
            if(i%m==0 && i%n==0)
            {
                break;
            }
        }
        System.out.print(i);
    }
}