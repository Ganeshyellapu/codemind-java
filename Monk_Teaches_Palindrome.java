import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int f=0;f<t;f++)
        {
            String s=sc.nextLine();
            String s1="";
            for(int i=s.length()-1;i>=0;i--)
            {
                s1+=s.charAt(i);
            }
            if(s.equals(s1))
            {
                if(s.length()%2==0)
                {
                    System.out.println("YES EVEN");
                }
                else
                {
                    System.out.println("YES ODD");
                }
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}