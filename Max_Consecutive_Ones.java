import java.util.*;
class Consecutive
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
        int c=0,max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                if(max<c)
                {
                    max=c;
                }
                c=0;
            }
            else
            {
                c+=1;
            }
        }
        if(max<c)
        {
            max=c;
        }
        System.out.println(max);
    }
}