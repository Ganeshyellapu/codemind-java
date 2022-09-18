import java.util.*;
class Ascending
{
    public static void main(String args[])
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1] && (i+1)<=n-1)
            {
                c+=1;
            }
        }
        if(c==n-1)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}