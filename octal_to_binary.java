import java.util.*;
class Octal
{
    public static void main(String args[])
    {
        String n,ans;
        int bin;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLine();
        bin=Integer.parseInt(n,8);
        ans=Integer.toBinaryString(bin);
        System.out.print(ans);
    }
}