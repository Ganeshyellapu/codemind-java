import java.util.*;
class Books
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        int s=0;
        int s1=0;
        for(int i=0;i<n;i++)
        {
            s=s+arr[i];
            s1=s1+b[i];
        }
        int k=s-s1;
        if(k<0)
        {
            System.out.print(Math.abs(k));
        }
        else
        {
            System.out.print(0);
        }
    }
}