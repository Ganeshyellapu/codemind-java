import java.util.*;
class Pronic
{
    public static boolean ispronic(int n)
    {
        for(int i=1;i<n;i++)
        {
            if(n==(i)*(i+1))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(ispronic(n))
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}