import java.util.*;
class Replace
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
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            int max=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                    arr[i]=max;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i==n-1)
            {
                arr[i]=-1;
                System.out.print(arr[i]);
            }
            else
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}