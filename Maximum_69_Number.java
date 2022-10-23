import java.util.*;
class Max_69
{
    public static void main(String args[])
    {
        int n,ind=0,r,temp;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        temp=n;
        while(temp!=0)
        {
           r=temp%10;
           arr[ind]=r;
           ind+=1;
           temp=temp/10;
        }
        for(int i=ind-1;i>=0;i--)
        {
            if(arr[i]==6)
            {
                arr[i]=9;
                break;
            }
        }
        for(int i=ind-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}