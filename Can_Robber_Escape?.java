import java.util.Scanner;
class Robber
{
    public static void main(String args[])
    {
        int[] arr =new int[50];
        int i,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                c+=1;
            }
        }
        if(c<=2)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}