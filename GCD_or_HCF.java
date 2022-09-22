import java.util.*;
class Hcf
{
    public static void main(String args[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=m;i>=1;i--)
        {
            if(n%i==0 && m%i==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
}