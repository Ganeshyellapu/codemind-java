import java.util.*;
class Ways
{
    public static int count(int k)
    {
        if(k<0)
        {
            return 0;
        }
        if(k==0)
        {
            return 1;
        }
        return count(k-1)+count(k-2)+count(k-3);
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(count(n));
    }
}