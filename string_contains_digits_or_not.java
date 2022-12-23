import java.util.*;
class Contains
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int f=0;f<t;f++)
        {
            String s=sc.nextLine();
            String s1="1234567890";
            int k=0;
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(s1.contains(ch+""))
                {
                    System.out.println("Yes");
                    k+=1;
                    break;
                }
            }
            if(k==0)
            {
                System.out.println("No");
            }
        }
        
    }
}