import java.util.*;
class Unique_odd
{
    public static int count(int k,int[] a)
    {
        int ct=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                ct+=1;
            }
        }
        return ct;
    }
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
        int[] b=new int[n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<i;j++)
            {
               if(arr[i]==arr[j])
               {
                   flag=1;
                   break;
               }
            }
            if(flag==0)
            {
                b[index]=arr[i];
                index++;
            }
        }
        int sum=0;
        for(int i=0;i<index;i++)
        {
            if(b[i]%2!=0)
            {
                sum=sum+b[i];
            }
        }
        System.out.print(sum);
    }
}