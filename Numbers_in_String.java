import java.util.*;
class Numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        int k;
        String dig="0123456789";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(dig.contains(ch+""))
            {
                k=Integer.parseInt(ch+"");
                sum=sum+k;
            }
        }
        System.out.println(sum);
    }
}