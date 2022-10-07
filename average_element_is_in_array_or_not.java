import java.util.*;
class Present
{
    public static void main(String args[])
    {
        int n,sum=0,avg;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/n;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(avg==arr[i])
            {
                c+=1;
            }
        }
        if(c>=1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}