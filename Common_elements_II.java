import java.util.*;
class ctt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        int[] b=new int[m];
        int[] c=new int[n+m];
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
            int g=0;
            for(int j=0;j<m;j++)
            {
                if(arr[i]==b[j])
                {
                    g=1;
                }
            }
            if(g==0)
            {
                c[ind++]=arr[i];
            }
        }
        for(int i=0;i<m;i++)
        {
            int g=0;
            for(int j=0;j<n;j++)
            {
                if(b[i]==arr[j])
                {
                    g=1;
                }
            }
            if(g==0)
            {
                c[ind++]=b[i];
            }
        }
        for(int i=0;i<ind;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}