import java.util.*;
class Palindromes
{
    public static void main(String args[])
    {
        int n,r,num,c=0,d=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            d=0;
            num=arr[i];
            while(num>0)
            {
                r=num%10;
                d=d*10+r;
                num=num/10;
            }
            if(arr[i]==d)
            {
                c+=1;
            }
        }
        System.out.print(c);
    }
}