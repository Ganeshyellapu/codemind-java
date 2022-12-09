import java.util.*;
class Position
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
        int k=sc.nextInt();
        int s=0,l=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                if(c==1)
                {
                    l=i;
                    break;
                }
                else
                {
                    s=i;
                    c=1;
                }
            }
        }
        if(c==0)
        {
            System.out.println("-1"+" "+"-1");
        }
        else
        {
            System.out.println(s+" "+l);
        }
    }
}