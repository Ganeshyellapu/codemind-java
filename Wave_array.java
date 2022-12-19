import java.util.*;
class Wave
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
        int c=1,k=1,l=0;
        for(int i=0;i<n-1;i++)
        {
           if(arr[i]<arr[i+1] && k==1)
           {
               c=1;
               k=0;
           }
           else if(arr[i]>arr[i+1] && c==1)
           {
               c=0;
               k=1;
           }
           else
           {
               l=1;
               System.out.println("no");
               break;
           }
        }
        if(l==0)
        {
            System.out.println("yes");
        }
    }
}