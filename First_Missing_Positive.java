import java.util.*;
class Missing
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
        for(int i=1;i<=n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==i)
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}