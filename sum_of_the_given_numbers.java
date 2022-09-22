import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        int n,m,o;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int sum=0;
           m=sc.nextInt();
           o=sc.nextInt();
           sum=m+o;
           System.out.println(sum);
        }
        
    }
}