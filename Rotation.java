import java.util.*;
class Rotation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int f=0;f<t;f++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int j=0;j<k;j++)
            {
                int temp=arr[n-1];
                for(int i=n-1;i>0;i--)
                {
                    arr[i]=arr[i-1];
                }
                arr[0]=temp;
            }
            for(int i=0;i<n;i++)
            {
                if(i==n-1)
                {
                   System.out.print(arr[i]);
                }
                else
                {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
}