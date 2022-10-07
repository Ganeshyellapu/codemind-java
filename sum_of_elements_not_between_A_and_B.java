import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        int n,sum=0,a,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                continue;
            }
            else
            {
                sum=sum+arr[i];
            }
        }
        System.out.print(sum);
    }
}