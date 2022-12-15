import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        int[] b=new int[m];
        int[] c=new int[n];
        int[] d=new int[m];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
        }
        int ind=0;
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
                c[ind++]=arr[i];
            }
        }
        int ind1=0;
        for(int i=0;i<m;i++)
        {
            int g=0;
            for(int j=0;j<i;j++)
            {
                if(b[i]==b[j])
                {
                    g=1;
                    break;
                }
            }
            if(g==0)
            {
                d[ind1++]=b[i];
            }
        }
        int ct=0;
        for(int i=0;i<ind;i++)
        {
            for(int j=0;j<ind1;j++)
            {
                if(c[i]==d[j])
                {
                    ct+=1;
                }
            }
        }
        System.out.println(ct);
    }
}