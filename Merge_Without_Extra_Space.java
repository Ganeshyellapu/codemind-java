import java.util.*;
class Merge
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int h=0;h<t;h++)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[m];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++)
            {
                b[i]=sc.nextInt();
            }
            int[] c=new int[n+m];
            int ind=0;
            for(int i=0;i<n;i++)
            {
                c[ind++]=a[i];
            }
            for(int i=0;i<m;i++)
            {
                c[ind++]=b[i];
            }
            Arrays.sort(c);
            for(int i=0;i<n+m;i++)
            {
                if(i==(n+m)-1)
                {
                    System.out.print(c[i]);
                    break;
                }
                else
                {
                    System.out.print(c[i]+" ");
                }
            }
            System.out.println();
        }
    }
}