import java.util.Scanner;
class Optimal
{
    public static void main(String args[])
    {
        int t,total,i;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            int j;
            for(j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            int min=arr[0];
            int max=arr[0];
            for(j=0;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                }
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
            if(arr[0]==min && arr[n-1]==max)
            {
                System.out.println("0");
            }
            else
            {
                total=max-min;
                System.out.println(total);
            }
        }
    }
}