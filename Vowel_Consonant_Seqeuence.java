import java.util.*;
class V_C_sequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1="aeiou";
        String s2="";
        int c=0,c1=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(s1.contains(ch+""))
            {
                c1=0;
                if(c==1)
                {
                    continue;
                }
                s2+="V";
                c+=1;
            }
            else
            {
                c=0;
                if(c1==1)
                {
                    continue;
                }
                s2+="C";
                c1+=1;
            }
        }
        System.out.println(s2);
    }
}