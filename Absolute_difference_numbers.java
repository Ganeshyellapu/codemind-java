import java.util.*;
class Absolute
{
    public static void main(String args[])
    {
        int n,x,r,s,diff,ans;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=sc.nextInt();
        int d=(int)Math.log10(n)+1;// digit count
        diff=d-x; //to get digits from front
        r=n%(int)Math.pow(10,x);//to get digits from back
        s=n/(int)Math.pow(10,diff);
        ans=Math.abs(r-s);
        System.out.print(ans);
    }
}