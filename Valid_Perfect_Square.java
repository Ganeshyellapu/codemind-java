import java.util.*;
class Valid
{
    public static boolean isper(int m)
    {
        int sq;
        for(int i=1;i<=m;i++)
        {
            sq=i*i;
            if(sq==m)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            m=sc.nextInt();
            if(isper(m))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}