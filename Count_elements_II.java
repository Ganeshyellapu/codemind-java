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
        int k=0;
        int[] kk=new int[n];
        for(int i=0;i<ind;i++)
        {
            int gg=0;
            for(int j=0;j<ind1;j++)
            {
                if(c[i]==d[j])
                {
                    gg=1;
                    break;
                }
            }
            if(gg==0)
            {
                kk[k++]=c[i];
            }
        }
        int f=0;
        int[] ff=new int[m];
        for(int i=0;i<ind1;i++)
        {
            int cc=0;
            for(int j=0;j<ind;j++)
            {
                if(d[i]==c[j])
                {
                    cc=1;
                    break;
                }
            }
            if(cc==0)
            {
                ff[f++]=d[i];
            }
        }
        System.out.println(f+k);
    }
}