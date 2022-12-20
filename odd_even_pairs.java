import java.util.*;
class ODD_EVEN
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
        int ev=0,od=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                ev+=1;
            }
            else
            {
                od+=1;
            }
        }
        int[] b=new int[ev];
        int[] c=new int[od];
        int ec=0,oc=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                b[ec++]=arr[i];
            }
            else
            {
                c[oc++]=arr[i];
            }
        }
        if(ev>od)
        {
            for(int i=0;i<oc;i++)
            {
                System.out.print(c[i]+" "+b[i]+" ");
            }
            for(int i=oc;i<ec;i++)
            {
                System.out.print(b[i]+" ");
            }
        }
        else if(oc>ec)
        {
            for(int i=0;i<ec;i++)
            {
                System.out.print(c[i]+" "+b[i]+" ");
            }
            for(int i=ec;i<oc;i++)
            {
                System.out.print(c[i]+" ");
            }
        }
        else
        {
            for(int i=0;i<oc;i++)
            {
                System.out.print(c[i]+" "+b[i]+" ");
            }
        }
        if(n%2!=0)
        {
            System.out.print("0");
        }
    }
}