import java.util.*;
class Students
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
        int n1=sc.nextInt();
        int[] b=new int[n1];
        for(int i=0;i<n1;i++)
        {
            b[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k && b[i]>=k)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}