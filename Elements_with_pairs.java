import java.util.*;
class Pairs
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(n%2==0)
        {
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        else
        {
            for(int i=0;i<=n;i++)
            {
                if(i==n)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}