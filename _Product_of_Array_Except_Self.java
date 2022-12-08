import java.util.*;
class Self
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
            b[i]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            int pro=1;
            for(int j=0;j<n;j++)
            {
                if(arr[i]!=b[j])
                {
                    pro=pro*b[j];
                }
            }
            System.out.print(pro+" ");
        }
    }
}