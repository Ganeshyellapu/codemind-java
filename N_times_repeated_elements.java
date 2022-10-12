import java.util.*;
class N_times
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
        int n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        int index=0;
        int[] b=new int[n];
        for(int i=0;i<n;i++)
        {
            int f=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                b[index]=arr[i];
                index++;
            }
        }
        int e=0;
        for(int i=0;i<index;i++)
        {
            if(count(b[i],arr)==k)
            {
                System.out.print(b[i]+" ");
                e+=1;
            }
        }
        if(e==0)
        {
            System.out.print(-1);
        }
    }
}