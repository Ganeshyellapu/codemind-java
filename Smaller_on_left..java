import java.util.*;
class Smaller
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
            int c=0,min=0;
            for(int j=0;j<i;j++)
            {
                if(arr[j]<arr[i])
                {
                    c=1;
                    min=arr[j];
                }
            }
            if(c==0)
            {
                b[i]=-1;
            }
            else
            {
                b[i]=min;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");   
        }
    }
}