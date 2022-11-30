import java.util.*;
class Best_time
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                s=s+arr[i+1]-arr[i];
            }
        }
        System.out.print(s);
    }
}