import java.util.*;
class Max_String
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch=s.charAt(0);
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            if((int)ch1>(int)ch)
            {
                ch=ch1;
            }
        }
        System.out.println(ch);
    }
}